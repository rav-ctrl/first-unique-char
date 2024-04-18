# First Unique Character in a String

This repository contains a Kotlin implementation for finding the first non-repeating character in a given string. The solution efficiently identifies the first unique character using `LinkedHashMap` and `HashSet` to track the occurrence and indices of characters.

## Problem Overview

Given a string `s`, the goal is to return the index of the first non-repeating character. If every character repeats, the function returns -1.

### Examples

- **Input:** `"raviscoding"`
- **Output:** `0`

## Solution Approach

The solution utilizes a `LinkedHashMap` to preserve the insertion order of characters while tracking their indices. A `HashSet` is used to keep track of characters that are found more than once, allowing for efficient removals from the map.

## Usage

Add the function `firstUniqChar(s: String): Int` to your project to utilize the solution.

[Problem Link](https://leetcode.com/problems/first-unique-character-in-a-string/description)

Feel free to explore the implementation and adapt it as needed!
