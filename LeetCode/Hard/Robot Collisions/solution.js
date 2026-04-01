/**
 * @param {number[]} positions
 * @param {number[]} healths
 * @param {string} directions
 * @return {number[]}
 */
var survivedRobotsHealths = function(positions, healths, directions) {
    const n = positions.length;
    const indices = Array.from({ length: n }, (_, i) => i);

    // Sort indices based on the positions of the robots
    indices.sort((a, b) => positions[a] - positions[b]);

    const stack = []; // To store indices of robots moving Right ('R')

    for (let i of indices) {
        if (directions[i] === 'R') {
            stack.push(i);
        } else {
            // Robot is moving Left ('L'), check for collisions with 'R' robots in stack
            while (stack.length > 0 && healths[i] > 0) {
                let topIdx = stack[stack.length - 1];

                if (healths[i] > healths[topIdx]) {
                    // Left robot wins
                    healths[topIdx] = 0;
                    healths[i] -= 1;
                    stack.pop();
                } else if (healths[i] < healths[topIdx]) {
                    // Right robot wins
                    healths[i] = 0;
                    healths[topIdx] -= 1;
                } else {
                    // Both destroyed
                    healths[i] = 0;
                    healths[topIdx] = 0;
                    stack.pop();
                }
            }
        }
    }

    // Filter out robots with 0 health and return remaining healths in original order
    return healths.filter(h => h > 0);
};