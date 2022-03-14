# BlackjackProject

Description:

For this project I built a Black-Jack card game simulation in which the program will auto generate cards from a deck and a user can then interact with the program against a simulated dealer. The user has the option to hit and receive more cards or stay and the program will continue until there is a winner. The program is designed to compare the users card hand  and the computers  card hand to determine who wins and loses based on the Rules of Blackjack.

Technologies used:

This program utilized Object oriented programming to utilize methods and lists from multiple different classes and have them interact with each other. I created an arraylist and used its to string to help display its card data and total hand value. I then created multiple methods to perform different tasks that would help the game function.

Lessons Learned:

This was an extremely challenging project for me. When first starting it, it was very hard to conceptualize how to get everything moving in the right direction and how everything should interact. Once I got moving I became more comfortable with where everything was in my class hierarchy and most tasks seemed simple. One roadblock I ran into was with displaying only one card for the dealer. I spent over 20 hours and stayed up all of saturday night manipulating and changing my code to try to make that work after my program was essentially finished and working. I created methods that worked for this purpose however they did not interact well with my toString which I had created all my If statements for game outcomes to incorporate. When using the seperate dealer Show-card method with the card assigned to specific spot in arraylist it always worked fine for the first dealer hand however  one of the cards would always be different on the dealers second hand and thus was not a fully accurate game as one of the cards wouldn't carry over. I realized a way to get around this issue in theory however doing so would essentially have me starting over from scratch and so stubbornly I kept trying to find a way make it work with the code structure I had. After much frustration and knowing that there was nothing in the grading criteria or instructions about one of dealers cards being hidden, I reverted my code back to how it was saturday afternoon before investing 16 more hours and a sleepless night tinkering with it. Hopefully I learned many lessons by breaking my code and putting it back together again countless times all for one minor change. Late night rant concluded , time for bed.
