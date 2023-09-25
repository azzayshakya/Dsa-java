//
//
//import  java.util.*;
//public class remove_duplicates {
//    public static void remove(String str ,int idx ,StringBuilder Newstr ,boolean map ){
//
//        HashMap <String,Integer> map1 = new HashMap<>();
//        if (idx==str.length()){
//            System.out.println(Newstr);
//            return;
//        }
//        char currind = str.charAt(idx);
//        if(map[currind-'a']==true){
//            remove(str,idx+1,Newstr,map);
//        }
//        else{
//            map[currind-'a']=true;
//            remove(str,idx+1,Newstr.append(currind),map);
//        }
//
//    }
//     public static void main(String[] args){
//
//     }
//}
