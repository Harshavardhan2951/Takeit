/**
 * function expression : Function without a name (anonymous
 *                       function) avoid polluting the global
 *                       scope with it, write it, then forget
 *                       about it.
 */

const greeting = function() {
    console.log("Hello bro....")
}
greeting();