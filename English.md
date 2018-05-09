http://lfal.co/commonsheet

https://tinyurl.com/yaq4u4n2

// Create Receipt
// set shop name to be Grocery Store
// Set address to be 1146 budapest
// Set the tax number to  1143
// set tax percentage to 10%
// set milk price to 1
// buy 1 milk  
// checkout
// check total price = 1
// check receipt




// Create Receipt
// set shop name to be Grocery Store
// Set address to be 1146 budapest
// Set the tax number to  1143
// set tax percentage to 10%
// set milk price to 1 per carton
// buy 1 milk
// set sugar price to 2.30 per kg
// buy 1 kg  sugar  
// checkout
// check total price = 3.3
// check receipt








// Create Receipt
// set shop name to be Grocery Store
// Set address to be 1146 budapest
// Set the tax number to  1143
// set tax percentage to 10%
// set milk price to 1 per carton
// set sugar price to 2.30 per kg
// Set beer price to 1 per bottle
// Add buy 1 get 1 free discount to beer
// buy 1 milk
// Buy 2 beer
// buy 1 kg  sugar  
// checkout
// check total price = 3.3
// check receipt

// buy 1 kg of Sugar at $1 per kilo




// generate minesweeper table 5x6
// place mine 1,0
// place mine 2,1
// click on 2,0
// check 2,0 should display 2
// click 1,0
// check the game is lost


create table 5 by 6
generate basics
take black on 3,4
check 3,3 result: black
take white on 0,4
Check 0,4 is empty
check result: not allowed
take white on 1,2
check result: not allowed
take white on 4,4
check 3,3 result: white






//battleship
//generate  Battleship table 5*7
// Place sub vertical on (1,1)
// place aircraft  horizontal on (0,5)
//bomb (4,4)
// check msg “Miss”
// bomb (1,1)
// Check msg “Hit”
// bomb (1,2)
// Check msg “Hit”
// bomb (1,3)
// Check msg “Hit”
// Check sub is sink


// Place sub vertical on (1,1)
board.place(Ship.SUB, Direction.Vertical, new Poin(1,1))

// Generate a sub
Sub sub = new Sub();
// Place it vertically at (1,1)
board.place(sub, Direction.Vertical, new Poin(1,1))

// place a sub vertically at 1,1
board.place(new Sub(), Direction.Vertical, new Poin(1,1))





create checker board
put B at (1,2), (1,4), (3,2), (3,5)
put W at (3,2)
Start game
W turn
jump from (3,2) to ..
verify possible to jump again
Verify black is removed
jump .. to ..
Verify piece is queened
jump .. to ..
verify jump
verify game won
