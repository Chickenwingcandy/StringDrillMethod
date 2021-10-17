import java.sql.SQLOutput;

public class sDrills {

    private String jeff ="";

    private String jane = "Rhonda";

    private String beef = "Mike";

    private String pizza = "Jan";

    private String pork = null;

    private String aStringWhichIsName = "12";

    private String onlyExistsToBeCompared = "Nevada";

    public String getOnlyExistsToBeCompared() {
        return onlyExistsToBeCompared;
    }

    public void setOnlyExistsToBeCompared(String onlyExistsToBeCompared) {
        this.onlyExistsToBeCompared = onlyExistsToBeCompared;
    }

    public String getaStringWhichIsName() {
        return aStringWhichIsName;
    }

    public void setaStringWhichIsName(String aStringWhichIsName) {
        this.aStringWhichIsName = aStringWhichIsName;
    }


    public String howLongIsThisWord(String countThis){

        String amountOfLetters = String.valueOf(countThis.length());

        System.out.println(amountOfLetters);

        return amountOfLetters;
    }

    public String lastLetter(String lastLetterInWord){

        String letterIs = String.valueOf(lastLetterInWord.charAt(lastLetterInWord.length()-1));

        System.out.println(letterIs);

        return letterIs;
    }

    public String firstLetter(String firstLetterInWord){

        char[] lettersInWord = firstLetterInWord.toCharArray();

        String letterIs = String.valueOf(lettersInWord[0]);

        System.out.println(letterIs);

        return letterIs;
    }

    public String partOfSentence (String inputSentence){

        String partOfSentence = inputSentence.substring(0,5);

        System.out.println(partOfSentence);

        return partOfSentence;
    }

    public String makeTheSentenceBackwards (String input){

        String reversedSentence = "";

        char [] brokenStentence = input.toCharArray();

        for(int i = brokenStentence.length - 1; i >=0; i--){
           reversedSentence += (String.valueOf(brokenStentence[i]));
        }

        System.out.println(reversedSentence);

        return reversedSentence;
    }

    public String countToANumber(int number){

        String numberCounter = "";

        for(int i = -1; i < number; i++) {

            numberCounter += String.valueOf(i + 1) + " ";

        }

        System.out.println(numberCounter);

        return numberCounter;
    }

    public String numberToStringCount(int number){

        String space = " ";
        String numberCount ="";

        for(int i = 0; i <= number; i ++){

            numberCount += String.valueOf(i).concat(space);

        }

        System.out.println(numberCount);

        return numberCount;
    }

    public String sayMyName(String name){
        String greeting = "Hello, my name is ";

        return greeting.concat(name);
    }

    public String makeASentence (String first, String second, String third){
        String finalSentence = " ";
        String space = " ";

        finalSentence = first.concat(space).concat(second).concat(space).concat(third);

        return finalSentence;
    }



    public void writeName (){
//       System.out.println(jane);
//       System.out.println(beef);
//       System.out.println(pizza);
//       System.out.println(pork);
       System.out.println(onlyExistsToBeCompared);
       System.out.println(aStringWhichIsName);
   }


}
