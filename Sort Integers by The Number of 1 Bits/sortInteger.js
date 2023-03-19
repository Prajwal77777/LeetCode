/**
 * @param {number[]} arr
 * @return {number[]}
 */
var sortByBits = function(arr) {
    function customSort(a, b) {

    const countA = countBits(a);

    const countB = countBits(b);

    if (countA !== countB) {

      return countA - countB;

    } else {

      return a - b;

    }

  }

  // Helper function to count the number of 1's in binary representation

  function countBits(num) {

    let count = 0;

    while (num !== 0) {

      count += num & 1;

      num = num >>> 1;

    }

    return count;

  }

  // Sort the array using the custom sort function

  arr.sort(customSort);

  return arr;
};
