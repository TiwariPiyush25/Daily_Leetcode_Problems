/**
 * @param {number} n
 * @return {Function} counter
 */
function createCounter(n){   
    function f() {
        return n++;
    };

    return f
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */