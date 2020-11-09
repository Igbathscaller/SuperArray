public class Demo {
    public static void main(String[]args){
        SuperArray input = new SuperArray();
        for(int i = 0; i<args.length;i++){
            input.add(args[i]);
        }
        System.out.println(input.contains("hi"));
        System.out.println(input);
        removeDuplicates(input);
        System.out.println(input);
        SuperArray blah = new SuperArray();
        blah.add("hi");         blah.add("hi1");        blah.add("hi2");        blah.add("hi2");        
        input.equals(blah);
        blah.add("hi2");        blah.add("hi2");        blah.add("hi2");        blah.add("hi5");        
        blah.add("hi3");        blah.add("hi5");        blah.add("hi3");        blah.add("hi3");
        blah.add("hi2");        blah.add("hi2");        blah.add("hi5");        blah.add("hi2");       
        blah.add("hi5");        blah.add("hi5");
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
        System.out.println(zip(word,wos));
        SuperArray ab = new SuperArray();
        SuperArray bc = new SuperArray();
        ab.add("a"); ab.add("b"); ab.add("c"); ab.add("d"); ab.add("e"); ab.add("f");
        bc.add("0"); bc.add("1"); bc.add("2"); bc.add("3");
        System.out.println(zip(ab,bc));
        ab = new SuperArray();
        bc = new SuperArray();
        ab.add("a"); ab.add("b"); ab.add("c");
        bc.add("0"); bc.add("1"); bc.add("2"); bc.add("3"); bc.add("4");
        System.out.println(zip(ab,bc));
    }

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

    public static SuperArray zip(SuperArray a, SuperArray b){
    
        SuperArray high = b;
        int        low = a.size();

        if (a.size()>b.size()){
            high = a;
            low  = b.size();
        }
    
        SuperArray c = new SuperArray(a.size()+b.size());
    
        for(int i = 0; i < low; i++){
            c.add(a.get(i));
            c.add(b.get(i));
        }

        for(int i = low; i < high.size(); i++){
            c.add(high.get(i));
        }

        return c;

    }

}
