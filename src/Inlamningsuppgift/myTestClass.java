package Inlamningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class myTestClass {


    @Test
//Testar antalet rader
    public void testCountRows() {
        //Arrange
        myLogicClass inputWord = new myLogicClass();

        //Act
        inputWord.setNumberOfRows("Hello");
        inputWord.setNumberOfRows("Montayre");
        int expected = 2;
        int actual = inputWord.getRows();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
//Testar antalet ord
    public void testCountNumberOfWords() {
        //Arrange
        myLogicClass countWords = new myLogicClass();

        //Act
        int expected = 0;
        int actual = countWords.getNumberOfWords();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
//Testar antalet tecken
    public void testNumberOfCharacters() {
        //Arrange
        myLogicClass countCharacters = new myLogicClass();

        //Act
        countCharacters.setNumberOfRows("Hello");
        int expected = 5;
        int actual = countCharacters.getNumberOfCharacters();

        //Assert
        assertEquals(expected, actual);
    }
}


//   @Test

//  public void testGetRows() {
//Arrange
//    myLogicClass myrows = new myLogicClass();

//Act
//   int expected = 0;
// int actual = myrows.getRows();

//Assert
// assertEquals(expected, actual);
// }

//@Test

//public void testCount1Row() {
//Arrange
//  myLogicClass inputWord = new myLogicClass();

//Act
//inputWord.setNumberOfRows("Hello");
//int expected = 1;
//int actual = inputWord.getRows();

//Assert
//assertEquals(expected, actual);






