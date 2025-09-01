package StringInterviewQues;

public class LargestSmallestWord {
    public static void main(String[] args) {
        
        String s = "I love programming in java";

        String[] words = s.split("\\s+");

        String smallest = words[0];
        String largest = words[0];

        for(String word : words){
            if(word.length() < smallest.length()){
                smallest = word;
            }
            if(word.length() > largest.length()){
                largest = word;
            }
        }

       

            
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);

    }
    
}

// public class LargestSmallestWordManual {
//     public static void main(String[] args) {
//         String s = "Java is super powerful";

//         int start = 0;
//         String smallest = "", largest = "";
        
//         for (int i = 0; i <= s.length(); i++) {
//             if (i == s.length() || s.charAt(i) == ' ') {
//                 String word = s.substring(start, i);
//                 if (smallest.isEmpty() || word.length() < smallest.length()) {
//                     smallest = word;
//                 }
//                 if (largest.isEmpty() || word.length() > largest.length()) {
//                     largest = word;
//                 }
//                 start = i + 1;
//             }
//         }

//         System.out.println("Smallest word: " + smallest);
//         System.out.println("Largest word: " + largest);
//     }
// }
