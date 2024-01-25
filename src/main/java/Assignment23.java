public class Assignment23 {
        public static void main(String[] args) {
            int marksSubject1 = 78;
            int marksSubject2 = 45;
            int marksSubject3 = 62;
    
            int totalMarks = marksSubject1 + marksSubject2 + marksSubject3;
    
            double percentage = (double) totalMarks / 300 * 100;
    
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        }
    }

