class UtilClass {
    totalCount(numArr) {
      // Given an array of numbers,  return the sum of the array
        let total = 0
        for (const num in numArr) {
            total += numArr[num]
        }
        return total
    }

    printMessages(msgArr) {
      // Given an array of String, write a function to print messages
        for (const msg in msgArr) {
            console.log(msgArr[msg])
        }
    }
}


console.log("Hello World")

var messagesPerDay = [5, 8, 6]
var messages = ["Please call back!", "Make sure you install jdk", "Help debug please!"]

var newBot = new UtilClass()

console.log(newBot.totalCount(messagesPerDay));
newBot.printMessages(messages);