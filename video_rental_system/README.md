# Problem

Design a video rental system to handle different rental scheme.

The system needs to handle the following rental scheme:

- Regular videos: $2.50 per day for the first 10 days, $3 per day afterwards
- Kids videos: $1.50 per day the first 14 days, $2 per day aferwards
- New Release videos: $2 per day for the first 20 days, $2.50 per day afterwards

# Analysis  

Aside from OOD, this question also test how well you are at designing abstraction and interface. The key point to remember is not to make assumptions about the regular prices, overcharged price and number of days to overcharge. Come up with the entitiy design first, and then throw in design patterns if it is suitable.

1. Questions to ask

- Can customers mix the different price schemes together?
- Are we going to add more schemes in the future?


2. Entitites