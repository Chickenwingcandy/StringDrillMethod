public class main {

    public static void main(String[] args) {

        sDrills sd = new sDrills();

        String amountOfLetters = "This";

        String aStringWhichIsName = "";
        String onlyExistsToBeCompared = "";

        sd.writeName();

        sd.setaStringWhichIsName("This is a sentence which has no meaning.");

        sd.writeName();

        aStringWhichIsName = sd.getaStringWhichIsName();

        sd.howLongIsThisWord(aStringWhichIsName);

        sd.lastLetter(aStringWhichIsName);

        sd.firstLetter(aStringWhichIsName);

        sd.partOfSentence(aStringWhichIsName);

        sd.makeTheSentenceBackwards(aStringWhichIsName);

        onlyExistsToBeCompared = sd.getOnlyExistsToBeCompared();

        System.out.println(aStringWhichIsName.equals(onlyExistsToBeCompared));

    }
}
