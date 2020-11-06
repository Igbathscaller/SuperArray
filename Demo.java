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
        System.out.println(blah);
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
        SuperArray c = a;
        removeDuplicates(c);
        for(int i = 0; i<c.size();){

        }
        return c;
    }
}
