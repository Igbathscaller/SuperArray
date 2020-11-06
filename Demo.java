public class Demo {
    public static void main(String[]args){
        SuperArray blah = new SuperArray();
        blah.add("hi");
        blah.add("hi1");
        blah.add("hi2");
        blah.add("hi2");
        blah.add("hi2");
        blah.add("hi2");
        blah.add("hi2");
        blah.add("hi5");
        blah.add("hi3");
        blah.add("hi5");
        blah.add("hi3");
        blah.add("hi3");
        blah.add("hi2");
        blah.add("hi2");
        blah.add("hi5");
        blah.add("hi2");
        blah.add("hi5");
        blah.add("hi5");
        removeDuplicates(blah);
        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro");
        System.out.println(words);
        removeDuplicates(words);
        System.out.println(words);
        SuperArray word = new SuperArray();
        word.add("ebi");     word.add("una");      word.add("kani");   word.add("unb");     
        SuperArray wos = new SuperArray();
        wos.add("ebi");     wos.add("una");      wos.add("kani");   wos.add("unb");     wos.add("unb");
        System.out.println(findOverlap(word, words));
        System.out.println(findOverlap(words, word));
        System.out.println(word);
        System.out.println(blah);
        System.out.println(word.equals(wos));
        wos.remove(4);
        System.out.println(word.equals(wos));
        System.out.println(word);
        System.out.println(wos);
    }
/*
    public static void removeDuplicates(SuperArray s){
        for(int i = 0; i<s.size()-1;i++){
            for(int j=i+1; j<s.size();){
                if (s.get(i).equals(s.get(j))){
                    s.remove(j);
                }
                else{
                    j++;
                }
            }
        }
    }
*/
    public static void removeDuplicates(SuperArray s){
        for(int i = 0; i<s.size();){
            if (s.indexOf(s.get(i))==i){
                i++;
            }
            else{
                s.remove(i);
            }
        }
    }

    public static SuperArray findOverlap(SuperArray a, SuperArray b){
        SuperArray c = new SuperArray();
        for(int i = 0; i<a.size();i++){
            if(b.contains(a.get(i))){
                c.add(a.get(i));
            }
        }
        removeDuplicates(c);
        return c;
    }
}
