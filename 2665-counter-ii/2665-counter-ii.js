/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    const n = init;
    var obj = {
        increment(){
            return ++init;
        },

        decrement(){
            return --init;
        },
        reset(){
            init = n;

            return init;
        }
    }

    return obj;
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */