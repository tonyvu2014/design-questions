# Problem

Design a video rental system to handle different rental scheme.

The system needs to handle the following rental schemes:

- Regular videos: $2.50 per day for the first 10 days, $3 per day afterwards
- Kids videos: $1.50 per day the first 14 days, $2 per day aferwards
- New Release videos: $2 per day for the first 20 days, $2.50 per day afterwards

# Analysis  

Aside from OOD, this question also test how well you are at designing abstraction and interface. The key point to remember is not to make assumptions about the regular prices, overcharged price and number of days to overcharge. Come up with the entitiy design first, and then throw in design patterns if it is suitable.

1. Questions to ask

- Can customers mix the different price schemes together?
- Are we going to add more schemes in the future?
- How many videos customers can rent each time?


2. Entitites

- Video 
- Rental (1 rental per video per checkout)
- Checkout (1 checkout per purchase)
- Customer 
- PriceModel (abstract class for a generic price model)

3. Implementation

Assumption:
- Customers can mix different rental schemes
- We may need to add more schemes int the future
- No limitation on the number of videos rented each time

They key to observe is that the 3 schemes only differs in normal price, overcharge price and number of days to overcharge. The calculation of the total rental price is the same. That is a chance for abstraction. I choose abstract class over interface to implement PriceModel in this case because:
- The 3 different schemes are similar and should be of the same type
- They share common behaviours (the calculation of the rental price)

So which price model should we use given the video type? When there are instances of different types to choose from, you should think of Factory pattern (when there are different algorithms to choose from, you should think of Strategy pattern). The benefits of using Factory pattern is the flexibility to add in other price models in the future (We only need to update the PriceModelFactory class).

I think the Customer class is somewhat redundant and is included for the sake of completion.