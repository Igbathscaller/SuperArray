public class Tester{
    public static void main(String[] args){
        SuperArray words = new SuperArray();
        System.out.println(words);
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        System.out.println(words);
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        System.out.println(words);
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        System.out.println(words);
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        System.out.println(words);
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        System.out.println(words);
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("hello");
        words.add("my");
        words.add("name");
        words.add("is");
        words.add("David");
        words.add("Hu");
        words.add(".");
        words.add("What");
        words.add("The");
        words.add("Cool");
        words.add("my");
        System.out.println(words);
        words.add("name");
        words.add("is");
        words.add("David");
        words.add("Hu");
        words.add(".");
        words.add("What");
        words.add("The");
        words.add("Cool");
        words.add("my");
        words.add("name");
        words.add("is");
        words.add("David");
        words.add("Hu");
        words.add(".");
        words.add("What");
        System.out.println(words);
        words.add("The");
        words.add("Cool");
        words.add("my");
        words.add("name");
        words.add("is");
        words.add("David");
        words.add("Hu");
        words.add(".");
        words.add("What");
        words.add("The");
        System.out.println(words);
        words.add("Cool");
        System.out.println(words);
        for(int i = 0; i < words.size(); i++){
        System.out.println( words.get(i) );
            }
        for(int i = 0; i < words.size(); i++){
            words.set(i,""+i*i);
            }
        for(int i = 0; i < words.size(); i++){
            System.out.println( words.get(i) );
            }
        
    }
}