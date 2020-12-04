public class StringManipulator {

    public String reverse(String word){
        StringBuilder interim = new StringBuilder();
        interim.append(word);

        return String.valueOf(interim.reverse());

    }

    public void printPhraseInPhrame(String phrase){

        int maxWordLength = findMaxStringLength(phrase);
        String[] phraseWords = phrase.split(" ");

        System.out.println("");
        //print upper limit frame
        for (int i=0; i<maxWordLength + 2; i++){
            System.out.print("*");
        }

        System.out.println("");

        //print the phraseWords
        for (String word:
                phraseWords) {
            System.out.print("*");
            System.out.print(word);

            if (word.length() < maxWordLength){
               for (int i = word.length(); i<maxWordLength; i++)
                   System.out.print(" ");
            }

            System.out.println("*");
        }

        //print lower limit frame
        for (int i=0; i<maxWordLength + 2; i++){
            System.out.print("*");
        }
    }

    private int findMaxStringLength(String phrase){

        String[] phraseWords = phrase.split(" ");
        int interimMax = 0;

        for (String word:
             phraseWords) {
            if (interimMax < word.length())
                interimMax = word.length();
        }

        return interimMax;
    }

}
