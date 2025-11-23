##**Flow of the program**
User will enter the program and the system will dispay names of the meals
User will enter the number of the choosen meal

###<ins>Absolute Factory pattern</ins>
System wil enter the switch and according to the choice the desired menu will be displayed

###<ins>Decorator</ins>
System will display the name of toppings
User will enter the number of the chosen topping
System will enter the switch and according to the choices system will add the desired topping to the order

System will add the order
System will display two choices if you want to add on order or end the order
If the user chooses to add on the order, system will go to step 2 to step 9 again
If the user chooses to end the order so system will display user's order

###<ins>Observer</ins>
System will notify the waiter and the kitchen (Observers)

##<ins>Strategy</ins>
System display a list of payment methods
User will enter the number of the chosen method
System observer will be notified that order has finished


##**Test cases**
**1:**
1      (Eastern)
1      (Veg)
1      (Select item 1)
1      (Add Cheese)
2      (End orders)
3      (Cash payment)

**2:**
2      (Italian)
2      (Non-Veg)
2      (Item #2)
2      (Sauce)
2      (End orders)
1      (Credit card)

**3:**
1      (Eastern)
1      (Veg)
1      (Item #1)
4      (Without adds)
1      (add another order)

3      (Burger)
2      (Non-Veg)
2      (Item #2)
1      (Cheese)
2      (End orders)
3      (cash)
