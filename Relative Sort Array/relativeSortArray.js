/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
var relativeSortArray = function(arr1, arr2) {
    const map = new Map();
    for (let i = 0; i < arr2.length; i++) {
        map.set(arr2[i], i);
    }
    arr1.sort((a, b) => {
        const aIndex = map.get(a);
        const bIndex = map.get(b);
        if (aIndex !== undefined && bIndex !== undefined) {
            return aIndex - bIndex;
        } else if (aIndex !== undefined) {
            return -1;
        } else if (bIndex !== undefined) {
            return 1;
        } else {
            return a - b;
        }
    });
    return arr1;
};
