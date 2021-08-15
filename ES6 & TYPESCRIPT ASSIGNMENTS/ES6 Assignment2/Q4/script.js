"use strict";
class User {
    constructor(name, message) {
        this.name = name;
        this.message = message;
    }
}
let msgUser1 = new Map();
msgUser1.set("message1", "User1 message1");
msgUser1.set("message2", "UUser 2");
let user1 = new User("A", msgUser1);
let msgUser2 = new Map();
msgUser2.set("message1", "User2 message1");
msgUser2.set("message2", "User2 message2");
let user2 = new User("B", msgUser2);
let msgUser3 = new Map();
msgUser3.set("message1", "User3 message1");
msgUser3.set("message2", "User3 message2");
let user3 = new User("C", msgUser3);
let msgUser4 = new Map();
msgUser4.set("message1", "User4 message1");
msgUser4.set("message2", "User4 message2");
let user4 = new User("D", msgUser4);
let msgUser5 = new Map();
msgUser5.set("message1", "User5 message1");
msgUser5.set("message2", "User5 message2");
let user5 = new User("E", msgUser5);
let msgUser6 = new Map();
msgUser6.set("message1", "User6 message1");
msgUser6.set("message2", "User6 message2");
let user6 = new User("F", msgUser6);
let usersSet = new Set();
let usersSet2 = new Set();
usersSet.add(user1);
usersSet.add(user2);
usersSet.add(user3);
function addUserRoom2(user) {
    if (!usersSet.has(user) && usersSet2.size < 3) {
        usersSet2.add(user);
    }
}
addUserRoom2(user4);
addUserRoom2(user5);
addUserRoom2(user1);
addUserRoom2(user6);
let chatroom = new Map();
chatroom.set("chatroom1", usersSet);
chatroom.set("chatroom2", usersSet2);
console.log(chatroom);
