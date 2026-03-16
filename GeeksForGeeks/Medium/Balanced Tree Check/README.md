# Balanced Tree Check

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1?page=5&sortBy=submissions)

## Solved On
16 Mar 2026 at 11:19 pm

<h2><a href="https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1?page=5&sortBy=submissions">Balanced Tree Check</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given the<strong>&nbsp;root&nbsp;</strong>of a&nbsp;binary tree, determine if it is <strong>height-balanced </strong>or not.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong> A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [10, 20, 30, 40, 60]<br></span><span style="font-size: 14pt;">   <img style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700166/Web/Other/blobid1_1739353289.png" alt="" width="300" height="260"> <br><strong>Output:</strong> true <br><strong>Explanation:</strong> The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [1, 2, 3, 4, N, N, N, 5]
   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700166/Web/Other/blobid2_1739353291.png" alt="" width="301" height="269">
<strong>Output:</strong> false
<strong>Explanation:</strong> The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 1000<br>1 ≤ node-&gt;data ≤ </span><span style="font-size: 18.6667px;">10<sup>4</sup></span></p>