public class sDrills {

    private String jeff ="";

    private String jane = "Rhonda";

    private String beef = "Mike";

    private String pizza = "Jan";

    private String pork = null;

    private String aStringWhichIsName = "12";


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


   public void writeName (){
//       System.out.println(jane);
//       System.out.println(beef);
//       System.out.println(pizza);
//       System.out.println(pork);
       System.out.println(aStringWhichIsName);

   }


}
