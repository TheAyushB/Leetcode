function createCounter(n: number): () => number {
    let counter = 0;
    return function () {
        return n + (counter++);
    }
}


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */