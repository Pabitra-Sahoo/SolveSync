# Trapping Rain Water

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?page=2&sortBy=submissions)

## Solved On
23 Mar 2026 at 10:39 pm

<h2><a href="https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?page=2&sortBy=submissions">Trapping Rain Water</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr[] </strong>with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [3, 0, 1, 0, 4, 0, 2]
<strong>Output: </strong>10<strong>
Explanation: </strong>Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.<br></span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701211/Web/Other/blobid0_1741784862.png" alt=""></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [3, 0, 2, 0, 4]
<strong>Output: </strong>7<strong>
Explanation: </strong>Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3, 4]
<strong>Output: </strong>0<strong>
Explanation: </strong>We cannot trap water as there is no height bound on both sides.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 1, 5, 3, 1, 0, 4]
<strong>Output: </strong>9<strong>
Explanation: </strong>Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 <u>&lt;</u> arr.size() <u>&lt;</u> 10<sup>5</sup><br>0 <u>&lt;</u> arr[i] <u>&lt;</u> 10<sup>3</sup></span></p>