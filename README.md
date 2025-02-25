# api-inventory-sicpa
A simples API with Java and Spring Boot. There are two endpoints: 1 - POST "/onEvent" - Register item movements and 2 - GET "/inventory" - Get inventory by location

# Original text
Hi Rodrigo,

As part of our evaluation process for the software development position, we have prepared a short coding exercise. You are free to use any programming language of your choice.

# Scenario

We are tracking the movement of items across different locations over time. The following events occur:
- Time 1: Item 1 is added to Location A.
- Time 2: Item 2 is also added to Location A, so now both items are there.
- Time 3: Item 1 moves to Location B.

The inventory at each location should be updated accordingly.

Time | Location A     | Location B
1    | Item 1         |
2    | Item 1, Item 2 |
3    | Item 2         | Item 1

# API Requirements
Please implement two API functions:
- onEvent(itemId, locationId): Registers the movement of an item to a specified location.
- inventory(locationId): Returns the list of item IDs currently in the specified location.

# Example Usage
onEvent("item 1", "location A")
onEvent("item 2", "location A")

inventory("location A") --> ["item 1", "item 2"]
 
onEvent("item 1", "location B")

inventory("location A") --> ["item 2"]
inventory("location B") --> ["item 1"]

# Expectations
The solution should be functional and demonstrate clean, efficient code.
You may use any data structure you consider appropriate for managing the inventory.
Please provide a brief explanation of your approach.
 
