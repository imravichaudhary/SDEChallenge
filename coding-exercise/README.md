# Coding Exercise

## Project files

- **[LastNMovingAverage.java](./src/main/java/LastNMovingAverage.java)** - Interface for moving average for last N elements
- **[IntegerLastNMovingAverage.java](./src/main/java/IntegerLastNMovingAverage.java)** - Integer implementation of LastNMovingAverage
- **[MovingAverage.java](./src/main/java/MovingAverage.java)** - Example which show usage of LastNMovingAverage
- **[LastNMovingAverageTest.java](./src/test/java/LastNMovingAverageTest.java)** - Sample test for LastNMovingAverage

### LastNMovingAverage

`LastNMovingAverage` is an interface for calculating last N moving element average value

#### Usage

##### Implementation
The integer implementation for `LastNMovingAverage` interface is `IntegerLastNMovingAverage` which can be construct by passing the `N` as argument

```
public IntegerLastNMovingAverage(int N)
```

##### Interface Methods

| Return Type | Method | Description |
| ----------- |------- | ------------|
| void | addElement | add new element to the data structure |
| List| getElements|  get last N list of elements used for calculating average |
| Double | getAverage | get average of last N element |



