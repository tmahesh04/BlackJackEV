// package com.example;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Hashtable;
// import java.util.List;
// import java.util.Random;
// import org.javatuples.Pair;  


// /**
//  * Hello world!
//  *
//  */
// public class App 
// {
    
    

//     private static String checkFinal(String decision){
//         if(decision == "STAY" || decision == "SURRENDER"){
//             return "FINAL";
//         } else if(decision == "SPLIT"){
//             return "SPLIT";
//         } else if(decision == "DOUBLE"){
//             return "DOUBLE";
//         } else {
//             return "HIT";
//         }
//     }
    

       

//     private static ArrayList<Integer> getHandVal(ArrayList<String> hand){
//         int softHandTotalVal = 0;
//         int hardHandTotalVal = 0;
//         boolean aceCounted = false;
//         try{
//             for(int i = 0; i < hand.size(); i ++){
//                 if (hand.get(i).equals("A")) {
//                     hardHandTotalVal += 1;
//                     if (!aceCounted) {
//                         softHandTotalVal += 11;
//                         aceCounted = true;
//                     } else {
//                         softHandTotalVal += 1;
//                     }
//                 } else if (hand.get(i).equals("J") || hand.get(i).equals("Q") 
//                     || hand.get(i).equals("K")) {
//                     hardHandTotalVal += 10;
//                     softHandTotalVal += 10;
//                 } else {
//                     hardHandTotalVal +=
//                         Integer.parseInt(String.valueOf(hand.get(i)));
//                     softHandTotalVal +=
//                         Integer.parseInt(String.valueOf(hand.get(i)));
//                 }
//             } 
//         } catch(IndexOutOfBoundsException e){
//             System.out.println("error " + e);
//         }
//         return new ArrayList<>(Arrays.asList(softHandTotalVal,hardHandTotalVal));
//     }
    
//     public static void main( String[] args )
//     {
//         Hashtable<String, String[]> hardVals = new Hashtable<>();
//         Hashtable<String, String[]> softVals = new Hashtable<>();
//         Hashtable<String, String> doubleVals = new Hashtable<>();
//         hardVals.put("21A", new String[]{"STAY", "STAY"});
//         hardVals.put("212", new String[]{"STAY", "STAY"});
//         hardVals.put("213", new String[]{"STAY", "STAY"});
//         hardVals.put("214", new String[]{"STAY", "STAY"});
//         hardVals.put("215", new String[]{"STAY", "STAY"});
//         hardVals.put("216", new String[]{"STAY", "STAY"});
//         hardVals.put("217", new String[]{"STAY", "STAY"});
//         hardVals.put("218", new String[]{"STAY", "STAY"});
//         hardVals.put("219", new String[]{"STAY", "STAY"});
//         hardVals.put("2110", new String[]{"STAY", "STAY"});
//         hardVals.put("20A", new String[]{"STAY", "STAY"});
//         hardVals.put("202", new String[]{"STAY", "STAY"});
//         hardVals.put("203", new String[]{"STAY", "STAY"});
//         hardVals.put("204", new String[]{"STAY", "STAY"});
//         hardVals.put("205", new String[]{"STAY", "STAY"});
//         hardVals.put("206", new String[]{"STAY", "STAY"});
//         hardVals.put("207", new String[]{"STAY", "STAY"});
//         hardVals.put("208", new String[]{"STAY", "STAY"});
//         hardVals.put("209", new String[]{"STAY", "STAY"});
//         hardVals.put("2010", new String[]{"STAY", "STAY"});
//         hardVals.put("19A", new String[]{"STAY", "STAY"});
//         hardVals.put("192", new String[]{"STAY", "STAY"});
//         hardVals.put("193", new String[]{"STAY", "STAY"});
//         hardVals.put("194", new String[]{"STAY", "STAY"});
//         hardVals.put("195", new String[]{"STAY", "STAY"});
//         hardVals.put("196", new String[]{"STAY", "STAY"});
//         hardVals.put("197", new String[]{"STAY", "STAY"});
//         hardVals.put("198", new String[]{"STAY", "STAY"});
//         hardVals.put("199", new String[]{"STAY", "STAY"});
//         hardVals.put("1910", new String[]{"STAY", "STAY"});
//         hardVals.put("18A", new String[]{"STAY", "STAY"});
//         hardVals.put("182", new String[]{"STAY", "STAY"});
//         hardVals.put("183", new String[]{"STAY", "STAY"});
//         hardVals.put("184", new String[]{"STAY", "STAY"});
//         hardVals.put("185", new String[]{"STAY", "STAY"});
//         hardVals.put("186", new String[]{"STAY", "STAY"});
//         hardVals.put("187", new String[]{"STAY", "STAY"});
//         hardVals.put("188", new String[]{"STAY", "STAY"});
//         hardVals.put("189", new String[]{"STAY", "STAY"});
//         hardVals.put("1810", new String[]{"STAY", "STAY"});
//         hardVals.put("17A", new String[]{"SURRENDER", "STAY"});
//         hardVals.put("172", new String[]{"STAY", "STAY"});
//         hardVals.put("173", new String[]{"STAY", "STAY"});
//         hardVals.put("174", new String[]{"STAY", "STAY"});
//         hardVals.put("175", new String[]{"STAY", "STAY"});
//         hardVals.put("176", new String[]{"STAY", "STAY"});
//         hardVals.put("177", new String[]{"STAY", "STAY"});
//         hardVals.put("178", new String[]{"STAY", "STAY"});
//         hardVals.put("179", new String[]{"STAY", "STAY"});
//         hardVals.put("1710", new String[]{"STAY", "STAY"});
//         hardVals.put("17K", new String[]{"STAY", "STAY"});
//         hardVals.put("16A", new String[]{"SURRENDER", "HIT"});
//         hardVals.put("162", new String[]{"STAY", "STAY"});
//         hardVals.put("163", new String[]{"STAY", "STAY"});
//         hardVals.put("164", new String[]{"STAY", "STAY"});
//         hardVals.put("165", new String[]{"STAY", "STAY"});
//         hardVals.put("166", new String[]{"STAY", "STAY"});
//         hardVals.put("167", new String[]{"HIT", "HIT"});
//         hardVals.put("168", new String[]{"HIT", "HIT"});
//         hardVals.put("169", new String[]{"SURRENDER", "HIT"});
//         hardVals.put("1610", new String[]{"SURRENDER", "HIT"});
//         hardVals.put("15A", new String[]{"SURRENDER", "HIT"});
//         hardVals.put("152", new String[]{"STAY", "STAY"});
//         hardVals.put("153", new String[]{"STAY", "STAY"});
//         hardVals.put("154", new String[]{"STAY", "STAY"});
//         hardVals.put("155", new String[]{"STAY", "STAY"});
//         hardVals.put("156", new String[]{"STAY", "STAY"});
//         hardVals.put("157", new String[]{"HIT", "HIT"});
//         hardVals.put("158", new String[]{"HIT", "HIT"});
//         hardVals.put("159", new String[]{"HIT", "HIT"});
//         hardVals.put("1510", new String[]{"SURRENDER", "HIT"});
//         hardVals.put("14A", new String[]{"HIT", "HIT"});
//         hardVals.put("142", new String[]{"STAY", "STAY"});
//         hardVals.put("143", new String[]{"STAY", "STAY"});
//         hardVals.put("144", new String[]{"STAY", "STAY"});
//         hardVals.put("145", new String[]{"STAY", "STAY"});
//         hardVals.put("146", new String[]{"STAY", "STAY"});
//         hardVals.put("147", new String[]{"HIT", "HIT"});
//         hardVals.put("148", new String[]{"HIT", "HIT"});
//         hardVals.put("149", new String[]{"HIT", "HIT"});
//         hardVals.put("1410", new String[]{"HIT", "HIT"});
//         hardVals.put("13A", new String[]{"HIT", "HIT"});
//         hardVals.put("132", new String[]{"STAY", "STAY"});
//         hardVals.put("133", new String[]{"STAY", "STAY"});
//         hardVals.put("134", new String[]{"STAY", "STAY"});
//         hardVals.put("135", new String[]{"STAY", "STAY"});
//         hardVals.put("136", new String[]{"STAY", "STAY"});
//         hardVals.put("137", new String[]{"HIT", "HIT"});
//         hardVals.put("138", new String[]{"HIT", "HIT"});
//         hardVals.put("139", new String[]{"HIT", "HIT"});
//         hardVals.put("1310", new String[]{"HIT", "HIT"});
//         hardVals.put("12A", new String[]{"HIT", "HIT"});
//         hardVals.put("122", new String[]{"HIT", "HIT"});
//         hardVals.put("123", new String[]{"HIT", "HIT"});
//         hardVals.put("124", new String[]{"STAY", "STAY"});
//         hardVals.put("125", new String[]{"STAY", "STAY"});
//         hardVals.put("126", new String[]{"STAY", "STAY"});
//         hardVals.put("127", new String[]{"HIT", "HIT"});
//         hardVals.put("128", new String[]{"HIT", "HIT"});
//         hardVals.put("129", new String[]{"HIT", "HIT"});
//         hardVals.put("1210", new String[]{"HIT", "HIT"});
//         hardVals.put("11A", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("112", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("113", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("114", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("115", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("116", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("117", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("118", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("119", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("1110", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("10A", new String[]{"HIT", "HIT"});
//         hardVals.put("102", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("103", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("104", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("105", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("106", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("107", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("108", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("109", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("1010", new String[]{"HIT", "HIT"});
//         hardVals.put("9A", new String[]{"HIT", "HIT"});
//         hardVals.put("92", new String[]{"HIT", "HIT"});
//         hardVals.put("93", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("94", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("95", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("96", new String[]{"DOUBLE", "HIT"});
//         hardVals.put("97", new String[]{"HIT", "HIT"});
//         hardVals.put("98", new String[]{"HIT", "HIT"});
//         hardVals.put("99", new String[]{"HIT", "HIT"});
//         hardVals.put("910", new String[]{"HIT", "HIT"});
//         hardVals.put("8A", new String[]{"HIT", "HIT"});
//         hardVals.put("82", new String[]{"HIT", "HIT"});
//         hardVals.put("83", new String[]{"HIT", "HIT"});
//         hardVals.put("84", new String[]{"HIT", "HIT"});
//         hardVals.put("85", new String[]{"HIT", "HIT"});
//         hardVals.put("86", new String[]{"HIT", "HIT"});
//         hardVals.put("87", new String[]{"HIT", "HIT"});
//         hardVals.put("88", new String[]{"HIT", "HIT"});
//         hardVals.put("89", new String[]{"HIT", "HIT"});
//         hardVals.put("810", new String[]{"HIT", "HIT"});
//         hardVals.put("7A", new String[]{"HIT", "HIT"});
//         hardVals.put("72", new String[]{"HIT", "HIT"});
//         hardVals.put("73", new String[]{"HIT", "HIT"});
//         hardVals.put("74", new String[]{"HIT", "HIT"});
//         hardVals.put("75", new String[]{"HIT", "HIT"});
//         hardVals.put("76", new String[]{"HIT", "HIT"});
//         hardVals.put("77", new String[]{"HIT", "HIT"});
//         hardVals.put("78", new String[]{"HIT", "HIT"});
//         hardVals.put("79", new String[]{"HIT", "HIT"});
//         hardVals.put("710", new String[]{"HIT", "HIT"});
//         hardVals.put("6A", new String[]{"HIT", "HIT"});
//         hardVals.put("62", new String[]{"HIT", "HIT"});
//         hardVals.put("63", new String[]{"HIT", "HIT"});
//         hardVals.put("64", new String[]{"HIT", "HIT"});
//         hardVals.put("65", new String[]{"HIT", "HIT"});
//         hardVals.put("66", new String[]{"HIT", "HIT"});
//         hardVals.put("67", new String[]{"HIT", "HIT"});
//         hardVals.put("68", new String[]{"HIT", "HIT"});
//         hardVals.put("69", new String[]{"HIT", "HIT"});
//         hardVals.put("610", new String[]{"HIT", "HIT"});
//         hardVals.put("5A", new String[]{"HIT", "HIT"});
//         hardVals.put("52", new String[]{"HIT", "HIT"});
//         hardVals.put("53", new String[]{"HIT", "HIT"});
//         hardVals.put("54", new String[]{"HIT", "HIT"});
//         hardVals.put("55", new String[]{"HIT", "HIT"});
//         hardVals.put("56", new String[]{"HIT", "HIT"});
//         hardVals.put("57", new String[]{"HIT", "HIT"});
//         hardVals.put("58", new String[]{"HIT", "HIT"});
//         hardVals.put("59", new String[]{"HIT", "HIT"});
//         hardVals.put("510", new String[]{"HIT", "HIT"});


//         softVals.put("20A", new String[]{"STAY", "STAY"});
//         softVals.put("202", new String[]{"STAY", "STAY"});
//         softVals.put("203", new String[]{"STAY", "STAY"});
//         softVals.put("204", new String[]{"STAY", "STAY"});
//         softVals.put("205", new String[]{"STAY", "STAY"});
//         softVals.put("206", new String[]{"STAY", "STAY"});
//         softVals.put("207", new String[]{"STAY", "STAY"});
//         softVals.put("208", new String[]{"STAY", "STAY"});
//         softVals.put("209", new String[]{"STAY", "STAY"});
//         softVals.put("2010", new String[]{"STAY", "STAY"});
//         softVals.put("19A", new String[]{"STAY", "STAY"});
//         softVals.put("192", new String[]{"STAY", "STAY"});
//         softVals.put("193", new String[]{"STAY", "STAY"});
//         softVals.put("194", new String[]{"STAY", "STAY"});
//         softVals.put("195", new String[]{"STAY", "STAY"});
//         softVals.put("196", new String[]{"DOUBLE", "HIT"});
//         softVals.put("197", new String[]{"STAY", "STAY"});
//         softVals.put("198", new String[]{"STAY", "STAY"});
//         softVals.put("199", new String[]{"STAY", "STAY"});
//         softVals.put("1910", new String[]{"STAY", "STAY"});
//         softVals.put("18A", new String[]{"HIT", "HIT"});
//         softVals.put("182", new String[]{"DOUBLE", "STAY"});
//         softVals.put("183", new String[]{"DOUBLE", "STAY"});
//         softVals.put("184", new String[]{"DOUBLE", "STAY"});
//         softVals.put("185", new String[]{"DOUBLE", "STAY"});
//         softVals.put("186", new String[]{"DOUBLE", "STAY"});
//         softVals.put("187", new String[]{"STAY", "STAY"});
//         softVals.put("188", new String[]{"STAY", "STAY"});
//         softVals.put("189", new String[]{"HIT", "HIT"});
//         softVals.put("1810", new String[]{"HIT", "HIT"});
//         softVals.put("17A", new String[]{"HIT", "HIT"});
//         softVals.put("172", new String[]{"HIT", "HIT"});
//         softVals.put("173", new String[]{"DOUBLE", "HIT"});
//         softVals.put("174", new String[]{"DOUBLE", "HIT"});
//         softVals.put("175", new String[]{"DOUBLE", "HIT"});
//         softVals.put("176", new String[]{"DOUBLE", "HIT"});
//         softVals.put("177", new String[]{"HIT", "HIT"});
//         softVals.put("178", new String[]{"HIT", "HIT"});
//         softVals.put("179", new String[]{"HIT", "HIT"});
//         softVals.put("1710", new String[]{"HIT", "HIT"});
//         softVals.put("16A", new String[]{"HIT", "HIT"});
//         softVals.put("162", new String[]{"HIT", "HIT"});
//         softVals.put("163", new String[]{"HIT", "HIT"});
//         softVals.put("164", new String[]{"DOUBLE", "HIT"});
//         softVals.put("165", new String[]{"DOUBLE", "HIT"});
//         softVals.put("166", new String[]{"DOUBLE", "HIT"});
//         softVals.put("167", new String[]{"HIT", "HIT"});
//         softVals.put("168", new String[]{"HIT", "HIT"});
//         softVals.put("169", new String[]{"HIT", "HIT"});
//         softVals.put("1610", new String[]{"HIT", "HIT"});
//         softVals.put("15A", new String[]{"HIT", "HIT"});
//         softVals.put("152", new String[]{"HIT", "HIT"});
//         softVals.put("153", new String[]{"HIT", "HIT"});
//         softVals.put("154", new String[]{"DOUBLE", "HIT"});
//         softVals.put("155", new String[]{"DOUBLE", "HIT"});
//         softVals.put("156", new String[]{"DOUBLE", "HIT"});
//         softVals.put("157", new String[]{"HIT", "HIT"});
//         softVals.put("158", new String[]{"HIT", "HIT"});
//         softVals.put("159", new String[]{"HIT", "HIT"});
//         softVals.put("1510", new String[]{"HIT", "HIT"});
//         softVals.put("14A", new String[]{"HIT", "HIT"});
//         softVals.put("142", new String[]{"HIT", "HIT"});
//         softVals.put("143", new String[]{"HIT", "HIT"});
//         softVals.put("144", new String[]{"HIT", "HIT"});
//         softVals.put("145", new String[]{"DOUBLE", "HIT"});
//         softVals.put("146", new String[]{"DOUBLE", "HIT"});
//         softVals.put("147", new String[]{"HIT", "HIT"});
//         softVals.put("148", new String[]{"HIT", "HIT"});
//         softVals.put("149", new String[]{"HIT", "HIT"});
//         softVals.put("1410", new String[]{"HIT", "HIT"});
//         softVals.put("13A", new String[]{"HIT", "HIT"});
//         softVals.put("132", new String[]{"HIT", "HIT"});
//         softVals.put("133", new String[]{"HIT", "HIT"});
//         softVals.put("134", new String[]{"HIT", "HIT"});
//         softVals.put("135", new String[]{"DOUBLE", "HIT"});
//         softVals.put("136", new String[]{"DOUBLE", "HIT"});
//         softVals.put("137", new String[]{"HIT", "HIT"});
//         softVals.put("138", new String[]{"HIT", "HIT"});
//         softVals.put("139", new String[]{"HIT", "HIT"});
//         softVals.put("1310", new String[]{"HIT", "HIT"});


//         doubleVals.put("AA", "SPLIT");
//         doubleVals.put("A2", "SPLIT");
//         doubleVals.put("A3", "SPLIT");
//         doubleVals.put("A4", "SPLIT");
//         doubleVals.put("A5", "SPLIT");
//         doubleVals.put("A6", "SPLIT");
//         doubleVals.put("A7", "SPLIT");
//         doubleVals.put("A8", "SPLIT");
//         doubleVals.put("A9", "SPLIT");
//         doubleVals.put("A10", "SPLIT");
//         doubleVals.put("10A", "STAY");
//         doubleVals.put("102", "STAY");
//         doubleVals.put("103", "STAY");
//         doubleVals.put("104", "STAY");
//         doubleVals.put("105", "STAY");
//         doubleVals.put("106", "STAY");
//         doubleVals.put("107", "STAY");
//         doubleVals.put("108", "STAY");
//         doubleVals.put("109", "STAY");
//         doubleVals.put("1010", "STAY");
//         doubleVals.put("JA", "STAY");
//         doubleVals.put("J2", "STAY");
//         doubleVals.put("J3", "STAY");
//         doubleVals.put("J4", "STAY");
//         doubleVals.put("J5", "STAY");
//         doubleVals.put("J6", "STAY");
//         doubleVals.put("J7", "STAY");
//         doubleVals.put("J8", "STAY");
//         doubleVals.put("J9", "STAY");
//         doubleVals.put("J10", "STAY");
//         doubleVals.put("QA", "STAY");
//         doubleVals.put("Q2", "STAY");
//         doubleVals.put("Q3", "STAY");
//         doubleVals.put("Q4", "STAY");
//         doubleVals.put("Q5", "STAY");
//         doubleVals.put("Q6", "STAY");
//         doubleVals.put("Q7", "STAY");
//         doubleVals.put("Q8", "STAY");
//         doubleVals.put("Q9", "STAY");
//         doubleVals.put("Q10", "STAY");
//         doubleVals.put("KA", "STAY");
//         doubleVals.put("K2", "STAY");
//         doubleVals.put("K3", "STAY");
//         doubleVals.put("K4", "STAY");
//         doubleVals.put("K5", "STAY");
//         doubleVals.put("K6", "STAY");
//         doubleVals.put("K7", "STAY");
//         doubleVals.put("K8", "STAY");
//         doubleVals.put("K9", "STAY");
//         doubleVals.put("K10", "STAY");
//         doubleVals.put("9A", "STAY");
//         doubleVals.put("92", "SPLIT");
//         doubleVals.put("93", "SPLIT");
//         doubleVals.put("94", "SPLIT");
//         doubleVals.put("95", "SPLIT");
//         doubleVals.put("96", "SPLIT");
//         doubleVals.put("97", "STAY");
//         doubleVals.put("98", "SPLIT");
//         doubleVals.put("99", "SPLIT");
//         doubleVals.put("910", "STAY");
//         doubleVals.put("8A", "SURRENDER");
//         doubleVals.put("82", "SPLIT");
//         doubleVals.put("83", "SPLIT");
//         doubleVals.put("84", "SPLIT");
//         doubleVals.put("85", "SPLIT");
//         doubleVals.put("86", "SPLIT");
//         doubleVals.put("87", "SPLIT");
//         doubleVals.put("88", "SPLIT");
//         doubleVals.put("89", "SPLIT");
//         doubleVals.put("810", "SPLIT");
//         doubleVals.put("7A", "HIT");
//         doubleVals.put("72", "SPLIT");
//         doubleVals.put("73", "SPLIT");
//         doubleVals.put("74", "SPLIT");
//         doubleVals.put("75", "SPLIT");
//         doubleVals.put("76", "SPLIT");
//         doubleVals.put("77", "SPLIT");
//         doubleVals.put("78", "HIT");
//         doubleVals.put("79", "HIT");
//         doubleVals.put("710", "HIT");
//         doubleVals.put("6A", "HIT");
//         doubleVals.put("62", "SPLIT");
//         doubleVals.put("63", "SPLIT");
//         doubleVals.put("64", "SPLIT");
//         doubleVals.put("65", "SPLIT");
//         doubleVals.put("66", "SPLIT");
//         doubleVals.put("67", "HIT");
//         doubleVals.put("68", "HIT");
//         doubleVals.put("69", "HIT");
//         doubleVals.put("610", "HIT");
//         doubleVals.put("5A", "HIT");
//         doubleVals.put("52", "DOUBLE");
//         doubleVals.put("53", "DOUBLE");
//         doubleVals.put("54", "DOUBLE");
//         doubleVals.put("55", "DOUBLE");
//         doubleVals.put("56", "DOUBLE");
//         doubleVals.put("57", "DOUBLE");
//         doubleVals.put("58", "DOUBLE");
//         doubleVals.put("59", "DOUBLE");
//         doubleVals.put("510", "HIT");
//         doubleVals.put("4A", "HIT");
//         doubleVals.put("42", "HIT");
//         doubleVals.put("43", "HIT");
//         doubleVals.put("44", "HIT");
//         doubleVals.put("45", "SPLIT");
//         doubleVals.put("46", "SPLIT");
//         doubleVals.put("47", "HIT");
//         doubleVals.put("48", "HIT");
//         doubleVals.put("49", "HIT");
//         doubleVals.put("410", "HIT");
//         doubleVals.put("3A", "HIT");
//         doubleVals.put("32", "SPLIT");
//         doubleVals.put("33", "SPLIT");
//         doubleVals.put("34", "SPLIT");
//         doubleVals.put("35", "SPLIT");
//         doubleVals.put("36", "SPLIT");
//         doubleVals.put("37", "SPLIT");
//         doubleVals.put("38", "HIT");
//         doubleVals.put("39", "HIT");
//         doubleVals.put("310", "HIT");
//         doubleVals.put("2A", "HIT");
//         doubleVals.put("22", "SPLIT");
//         doubleVals.put("23", "SPLIT");
//         doubleVals.put("24", "SPLIT");
//         doubleVals.put("25", "SPLIT");
//         doubleVals.put("26", "SPLIT");
//         doubleVals.put("27", "SPLIT");
//         doubleVals.put("28", "HIT");
//         doubleVals.put("29", "HIT");
//         doubleVals.put("210", "HIT");
//         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         Deck currDeck = Deck.newDeck();
//         ArrayList<String> dealerCards = new ArrayList<>();
//         ArrayList<String> ourCards = new ArrayList<>();
//         int numOthers = Randoms.random().nextInt(4);
//         System.out.println(numOthers);
//         ArrayList<ArrayList<String>> otherPlayerCards = new ArrayList<>();
//         for(int j = 0; j < numOthers; j ++){
//             otherPlayerCards.add(new ArrayList<>(Arrays.asList("100","100")));
//         }
//         int currItr = 0;
//         if(currDeck.hasNext() == true){
//             for(int i = 0; i < 2; i ++){
//                 for(int itr = 0; itr < numOthers; itr ++){
//                     try{
//                         String retVal = currDeck.next().rank().toString();
//                         otherPlayerCards.get(itr).set(currItr, retVal);
//                     } catch(IndexOutOfBoundsException e){
//                         System.out.println("Errro: " + e);
//                     }
//                 }
//                 ourCards.add(currDeck.next().rank().toString());
//                 if(currItr == 0){
//                     dealerCards.add(currDeck.next().rank().toString());
//                 }
//                 currItr += 1;
//             }
//         }
        
//         System.out.println("other " + otherPlayerCards);
//         System.out.println("our " + ourCards);
//         System.out.println("dealer " + dealerCards);

//         ArrayList<Integer> ourVals = getHandVal(ourCards);
//         // ArrayList<Integer> dealerVals = getHandVal(dealerCards);

//         // System.out.println("ourV " + ourVals);
//         String ourStringComparotorPair = "";
//         //also need to c hekc that we oinly have 2 cards fgor a pair
//         if(ourCards.get(0) == ourCards.get(1)){
//             if(ourCards.get(0).equals("J") || ourCards.get(0).equals("Q") || ourCards.get(0).equals("K")){
//                 ourStringComparotorPair += "10";
//             } else{
//                 ourStringComparotorPair += ourCards.get(0);
//             }
//             if(dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")){
//                 ourStringComparotorPair += "10";
//             } else{
//                 ourStringComparotorPair += dealerCards.get(0);
//             }
//         }
//         String ourStringComparotorRest = "";
//         int softHandTotalVal = ourVals.get(0);
//         int hardHandTotalVal = ourVals.get(1);
//         int handNumCount = ourVals.size();
//         String decision = "";

//         if (softHandTotalVal == 21 || hardHandTotalVal == 21) {
//             decision = "STAY";
//         }

//         else if (!ourStringComparotorPair.equals("")) {
//             decision = doubleVals.get(ourStringComparotorPair);
//         }

//         else if (softHandTotalVal != hardHandTotalVal && softHandTotalVal > 10 && softHandTotalVal <= 20) {
//             String keyVal = "";
//             if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                 keyVal = String.valueOf(softHandTotalVal) + "10";
//             } else {
//                 keyVal = (String.valueOf(softHandTotalVal) + dealerCards.get(0));
//             }
//             if (handNumCount == 2) {
//                 decision = softVals.get(keyVal)[0];
//             } else {
//                 decision = softVals.get(keyVal)[1];
//             }

//         } else {
//             String keyVal = "";
//             if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                 keyVal = String.valueOf(hardHandTotalVal) + "10";
//             } else {
//                 keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
//             }
//             if (handNumCount == 2){
//                 decision = hardVals.get(keyVal)[0];
//             } else {
//                 decision = hardVals.get(keyVal)[1];
//             }
//         }
//         ArrayList<String> testOurCards = new ArrayList<>(List.of("5", "5"));
//         double EV = 0.0;
//         double handDollarVal = 1.0;
//         boolean isComplete = false;
//         ArrayList<ArrayList<String>> ourCardsVar = new ArrayList<>();
//         int itr = 0;
//         System.out.println(decision);
//         // decision = "SPLIT";
//         if(decision == "HIT"){
//             String decision3 = "";
//             boolean isDone2 = false;
//             while(isDone2 == false){
//                 ourCards.add(currDeck.next().rank().toString());
//                 ArrayList<Integer> currHandVal = getHandVal(ourCards);
//                 if(currHandVal.get(1) > 21){
//                     isDone2 = true;
//                     decision3 = "BUST";
//                 }
//                 if (currHandVal.get(1) > 10 && currHandVal.get(1) <= 20) {
//                     String keyVal = "";
//                     if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                         keyVal = String.valueOf(currHandVal.get(1)) + "10";
//                     } else {
//                         keyVal = (String.valueOf(currHandVal.get(1)) + dealerCards.get(0));
//                     }
//                     System.out.println("KEYVAL " + keyVal);
//                     if (ourCards.size() == 2) {
//                         decision3 = softVals.get(keyVal)[0];
//                     } else {
//                         decision3 = softVals.get(keyVal)[1];
//                     }
//                 } else {
//                     String keyVal = "";
//                     if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                         keyVal = String.valueOf(hardHandTotalVal) + "10";
//                     } else {
//                         keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
//                     }
//                     if (ourCards.size() == 2){
//                         decision3 = hardVals.get(keyVal)[0];
//                     } else {
//                         decision3 = hardVals.get(keyVal)[1];
//                     }
//                 }
//                 if(decision3 == "STAY" ||  decision3 == "SURRENDER"){
//                     isDone2 = true;
//                 }
//                 System.out.println("HIT CV " + ourCards);
//             }
//         } else if(decision == "DOUBLE"){
//             ourCards.add(currDeck.next().rank().toString());
//             System.out.println("DOUBLE CV " + ourCards);
//         } else if(decision == "SURRENDER"){
//             System.out.println("SURRENDER CV " + ourCards);
//         } else if(decision ==  "STAY"){
//             System.out.println("STAY CV " + ourCards);
//         } else if(decision == "SPLIT") {
//             while(isComplete == false){
//                 String ourStringComparotorPair2 = "";
//                 String decision2 = "";
//                 if(ourCardsVar.size() == 0){
//                     ourCardsVar.add(new ArrayList<>(List.of("3", "3")));
//                 } else {
                    
//                     if(ourCardsVar.get(itr).get(1).equals("")){
//                         System.out.println("1 " + ourCardsVar);
//                         String nextVal = currDeck.next().rank().toString();
//                         ourCardsVar.get(itr).set(1, nextVal);
//                         // ourCardsVar.get(itr).add(nextVal);
//                         System.out.println("2 " + ourCardsVar);
//                         // itr = 0;

//                     }else if(ourCardsVar.get(itr).get(0).equals(ourCardsVar.get(itr).get(1))){
//                         int softHandTotalVal2 = getHandVal(ourCardsVar.get(itr)).get(0);
//                         int hardHandTotalVal2 = getHandVal(ourCardsVar.get(itr)).get(1);
//                         int handNumCount2 = ourCardsVar.get(itr).size();
//                         ArrayList<String> testOurCards2 = ourCardsVar.get(itr);
//                         if(testOurCards2.get(0).equals("J") || testOurCards2.get(0).equals("Q") || testOurCards2.get(0).equals("K")){
//                             ourStringComparotorPair2 += "10";
//                         } else{
//                             ourStringComparotorPair2 += testOurCards2.get(0);
//                         }
//                         if(dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")){
//                             ourStringComparotorPair2 += "10";
//                         } else{
//                             ourStringComparotorPair2 += dealerCards.get(0);
//                         }

//                         decision2 = doubleVals.get(ourStringComparotorPair2);
//                         String dec = doubleVals.get(ourStringComparotorPair2);
                       
                        
//                         System.out.println("DEC " + dec);

//                         if(dec == "SPLIT"){
//                             String t1 = ourCardsVar.get(itr).get(0);
//                             String t2 = ourCardsVar.get(itr).get(1);
//                             ourCardsVar.remove(itr);
//                             ourCardsVar.add(0, new ArrayList<>(Arrays.asList(t2,"")));
//                             ourCardsVar.add(0, new ArrayList<>(Arrays.asList(t1,"")));
//                             itr = 0;

//                         } else if(dec == "STAY"){
//                             itr += 1;
//                             // isComplete = true;
//                         } else if(dec == "SURRENDER"){
//                             itr += 1;
//                             // isComplete = true;
//                         } else if(dec == "DOUBLE"){
//                             itr += 1;
//                             ourCardsVar.get(itr).remove(1);
//                             ourCardsVar.get(itr).add(currDeck.next().rank().toString());
//                         } else if(dec == "HIT"){
//                             boolean isDone = false;
//                             if(ourCardsVar.get(itr).get(1).equals("")){
//                                 ourCardsVar.get(itr).remove(1);
//                             }
//                             while(isDone == false){
//                                 ourCardsVar.get(itr).add(currDeck.next().rank().toString());
//                                 ArrayList<Integer> currHandVal = getHandVal(ourCardsVar.get(itr));
//                                 if(currHandVal.get(1) > 21){
//                                     isDone = true;
//                                     decision2 = "BUST";
//                                 }
//                                 System.out.println("asdasd " + currHandVal );

//                                 if (currHandVal.get(1) > 10 && currHandVal.get(1) <= 20) {
//                                     String keyVal = "";
//                                     if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                                         keyVal = String.valueOf(currHandVal.get(1)) + "10";
//                                     } else {
//                                         keyVal = (String.valueOf(currHandVal.get(1)) + dealerCards.get(0));
//                                     }
//                                     System.out.println("KEYVAL " + keyVal);
//                                     if (handNumCount2 == 2) {
//                                         decision2 = softVals.get(keyVal)[0];
//                                     } else {
//                                         decision2 = softVals.get(keyVal)[1];
//                                     }
//                                 } else {
//                                     String keyVal = "";
//                                     if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                                         keyVal = String.valueOf(hardHandTotalVal) + "10";
//                                     } else {
//                                         keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
//                                     }
//                                     if (handNumCount2 == 2){
//                                         decision2 = hardVals.get(keyVal)[0];
//                                     } else {
//                                         decision2 = hardVals.get(keyVal)[1];
//                                     }
//                                 }
//                                 if(decision2 == "STAY" ||  decision2 == "SURRENDER"){
//                                     isDone = true;
//                                 }
//                             }
//                             itr += 1;
//                         }
//                     //     int softHandTotalVal2 = getHandVal(ourCardsVar.get(itr)).get(0);
//                     // int hardHandTotalVal2 = getHandVal(ourCardsVar.get(itr)).get(1);
//                     // int handNumCount2 = 2;
//                     }  else if (getHandVal(ourCardsVar.get(itr)).get(0) <= 20) {
//                             String keyVal = "";
//                             System.out.println("Non split");
//                             if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                                 keyVal = String.valueOf(getHandVal(ourCardsVar.get(itr)).get(0)) + "10";
//                             } else {
//                                 keyVal = (String.valueOf(getHandVal(ourCardsVar.get(itr)).get(0)) + dealerCards.get(0));
//                             }
//                             if (ourCardsVar.get(itr).size() == 2) {
//                                 decision2 = softVals.get(keyVal)[0];
//                             } else {
//                                 decision2 = softVals.get(keyVal)[1];
//                             }
//                             itr += 1;
//                         } else {
//                             System.out.println("Non split2");

//                             String keyVal = "";
//                             if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                                 keyVal = String.valueOf(hardHandTotalVal) + "10";
//                             } else {
//                                 keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
//                             }
//                             if (ourCardsVar.get(itr).size() == 2){
//                                 decision2 = hardVals.get(keyVal)[0];
//                             } else {
//                                 decision2 = hardVals.get(keyVal)[1];
//                             }
//                             boolean isDone = false;
//                             if(decision2 == "HIT"){
//                                 while(isDone == false){
//                                     String nextCard = currDeck.next().toString();

//                                 }
//                             }
//                             itr += 1;
//                         }
                    
//                         // itr = 0;
//                         // } else if(decision2 == "HIT"){
//                         //     boolean isDone = false;
//                         //     ourCardsVar.get(itr).remove(1);
//                         //     while(isDone == false){
//                         //         ourCardsVar.get(itr).add(currDeck.next().rank().toString());
//                         //         ArrayList<Integer> currHandVal = getHandVal(ourCardsVar.get(itr));
//                         //         if (currHandVal.get(0) != currHandVal.get(1) && currHandVal.get(0) > 10 && currHandVal.get(0) <= 20) {
//                         //             String keyVal = "";
//                         //             if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                         //                 keyVal = String.valueOf(softHandTotalVal2) + "10";
//                         //             } else {
//                         //                 keyVal = (String.valueOf(softHandTotalVal2) + dealerCards.get(0));
//                         //             }
//                         //             if (handNumCount2 == 2) {
//                         //                 decision2 = softVals.get(keyVal)[0];
//                         //             } else {
//                         //                 decision2 = softVals.get(keyVal)[1];
//                         //             }
//                         //         } else {
//                         //             String keyVal = "";
//                         //             if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//                         //                 keyVal = String.valueOf(hardHandTotalVal) + "10";
//                         //             } else {
//                         //                 keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
//                         //             }
//                         //             if (handNumCount2 == 2){
//                         //                 decision2 = hardVals.get(keyVal)[0];
//                         //             } else {
//                         //                 decision2 = hardVals.get(keyVal)[1];
//                         //             }
//                         //         }
//                         //     }}
//                     // }
//                     // 

//                         // itr+=1;
//                     // } else {
//                     //     itr += 1;
//                     // }
                    
//                     // if (softHandTotalVal2 == 21 || hardHandTotalVal2 == 21) {
//                     //     decision2 = "STAY";
//                     //     // itr += 1;
//                     // } else if(ourStringComparotorPair2 != ""){
                        
                   
//                 }
//                 if(itr >= ourCardsVar.size()){
//                     isComplete = true;
//                 }

//             }
//         }
//         // if(decision == "STAY"){

//         // } else if(decision == "DOUBLE"){
//         //     handDollarVal += 1;
//         //     ourCards.add(currDeck.next().rank().toString());
//         //     ArrayList<Integer> newVal = getHandVal(ourCards);

//         // } else if(decision == "SPLIT"){
//         //     while(isComplete == false){
//         //         if(itr > ourCardsVar.size()){
//         //             isComplete = true;
//         //         } 
//         //         else {

//         //                 if(ourCardsVar.size() == 0){
//         //                     ourCardsVar.add(new ArrayList<>(List.of("5", "5")));
//         //                 }
//         //             // for(int itr = 0; itr < ourCardsVar.size(); itr ++){
//         //                 if(ourCardsVar.get(itr).get(1).equals("")){
//         //                     String nextVal = currDeck.next().rank().toString();
//         //                     ourCardsVar.get(itr).remove(1);
//         //                     ourCardsVar.get(itr).add(nextVal);
//         //                 }
//         //                 if(ourCardsVar.get(itr).get(0) == ourCardsVar.get(itr).get(1)){
//         //                     if(testOurCards.get(0).equals("J") || testOurCards.get(0).equals("Q") || testOurCards.get(0).equals("K")){
//         //                         ourStringComparotorPair2 += "10";
//         //                     } else{
//         //                         ourStringComparotorPair2 += testOurCards.get(0);
//         //                     }
//         //                     if(dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")){
//         //                         ourStringComparotorPair2 += "10";
//         //                     } else{
//         //                         ourStringComparotorPair2 += dealerCards.get(0);
//         //                     }
//         //                 }
//         //                 String ourStringComparotorRest2 = "";
//         //                 int softHandTotalVal2 = getHandVal(ourCardsVar.get(itr)).get(0);
//         //                 int hardHandTotalVal2 = getHandVal(ourCardsVar.get(itr)).get(1);
//         //                 int handNumCount2 = 2;
//         //                 String decision2 = "";
//         //                 if (softHandTotalVal2 == 21 || hardHandTotalVal2 == 21) {
//         //                     decision2 = "STAY";
//         //                 }
//         //                 else if (softHandTotalVal2 != hardHandTotalVal2 && softHandTotalVal2 > 10 && softHandTotalVal2 <= 20) {
//         //                     String keyVal = "";
//         //                     if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//         //                         keyVal = String.valueOf(softHandTotalVal2) + "10";
//         //                     } else {
//         //                         keyVal = (String.valueOf(softHandTotalVal2) + dealerCards.get(0));
//         //                     }
//         //                     if (handNumCount2 == 2) {
//         //                         decision2 = softVals.get(keyVal)[0];
//         //                     } else {
//         //                         decision2 = softVals.get(keyVal)[1];
//         //                     }
//         //                 } else {
//         //                     String keyVal = "";
//         //                     if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//         //                         keyVal = String.valueOf(hardHandTotalVal) + "10";
//         //                     } else {
//         //                         keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
//         //                     }
//         //                     if (handNumCount2 == 2){
//         //                         decision2 = hardVals.get(keyVal)[0];
//         //                     } else {
//         //                         decision2 = hardVals.get(keyVal)[1];
//         //                     }
//         //                 }
//         //                 if(ourStringComparotorPair2 != ""){
//         //                     String dec = doubleVals.get(ourStringComparotorPair2);
//         //                     if(dec == "SPLIT"){
//         //                         itr = 0;
//         //                         String t1 = ourCardsVar.get(itr - 1).get(0);
//         //                         String t2 = ourCardsVar.get(itr - 1).get(1);
//         //                         ourCardsVar.remove(itr);
//         //                         ourCardsVar.add(0, new ArrayList<>(Arrays.asList(t2,"")));
//         //                         ourCardsVar.add(0, new ArrayList<>(Arrays.asList(t1,"")));
                                
//         //                     } else if(decision2 == "STAY"){
//         //                         // isComplete = true;
//         //                     } else if(decision2 == "SURRENDER"){
//         //                         // isComplete = true;
//         //                     } else if(decision2 == "DOUBLE"){
//         //                         ourCardsVar.get(itr - 1).remove(1);
//         //                         ourCardsVar.get(itr - 1).add(currDeck.next().rank().toString());
//         //                     } else if(decision2 == "HIT"){
//         //                         boolean isDone = false;
//         //                         ourCardsVar.get(itr).remove(1);
//         //                         while(isDone == false){
//         //                             ourCardsVar.get(itr).add(currDeck.next().rank().toString());
//         //                             ArrayList<Integer> currHandVal = getHandVal(ourCardsVar.get(itr));
//         //                             if (currHandVal.get(0) != currHandVal.get(1) && currHandVal.get(0) > 10 && currHandVal.get(0) <= 20) {
//         //                                 String keyVal = "";
//         //                                 if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//         //                                     keyVal = String.valueOf(softHandTotalVal2) + "10";
//         //                                 } else {
//         //                                     keyVal = (String.valueOf(softHandTotalVal2) + dealerCards.get(0));
//         //                                 }
//         //                                 if (handNumCount2 == 2) {
//         //                                     decision2 = softVals.get(keyVal)[0];
//         //                                 } else {
//         //                                     decision2 = softVals.get(keyVal)[1];
//         //                                 }
//         //                             } else {
//         //                                 String keyVal = "";
//         //                                 if (dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
//         //                                     keyVal = String.valueOf(hardHandTotalVal) + "10";
//         //                                 } else {
//         //                                     keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
//         //                                 }
//         //                                 if (handNumCount2 == 2){
//         //                                     decision2 = hardVals.get(keyVal)[0];
//         //                                 } else {
//         //                                     decision2 = hardVals.get(keyVal)[1];
//         //                                 }
//         //                             }
//         //                             if(decision2 == "HIT"){
//         //                                 isDone = false;
//         //                             } else {
//         //                                 isDone = true;
//         //                             }

//         //                         }
//         //                     }
//         //                 }

//         //             }
//         //             if(ourCardsVar.size() >= 1){
//         //                 itr +=1;
//         //             }

//         //         }
//         // } else if (decision == "HIT"){

//         // } else {
//         //     System.out.println("COmp[ute no clue]");
//         // }
//         // System.out.println(ourCardsVar);

//     }

// }


package com.example;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.io.*;


import org.javatuples.Pair;


/**
 * Hello world!
 *
 */
public class App
{



    private static String checkFinal(String decision){
        if(decision == "STAY" || decision == "SURRENDER"){
            return "FINAL";
        } else if(decision == "SPLIT"){
            return "SPLIT";
        } else if(decision == "DOUBLE"){
            return "DOUBLE";
        } else {
            return "HIT";
        }
    }




    private static ArrayList<Integer> getHandVal(ArrayList<String> hand){
        int softHandTotalVal = 0;
        int hardHandTotalVal = 0;
        boolean aceCounted = false;
        try{
            for(int i = 0; i < hand.size(); i ++){
                if (hand.get(i).equals("A")) {
                    hardHandTotalVal += 1;
                    if (!aceCounted) {
                        softHandTotalVal += 11;
                        aceCounted = true;
                    } else {
                        softHandTotalVal += 1;
                    }
                } else if (hand.get(i).equals("A") || hand.get(i).equals("B") || hand.get(i).equals("D") || hand.get(i).equals("E")
                || hand.get(i).equals("J") || hand.get(i).equals("Q") || hand.get(i).equals("K")) {
                    hardHandTotalVal += 10;
                    softHandTotalVal += 10;
                } else {
                    hardHandTotalVal +=
                        Integer.parseInt(String.valueOf(hand.get(i)));
                    softHandTotalVal +=
                        Integer.parseInt(String.valueOf(hand.get(i)));
                }
            }
        } catch(IndexOutOfBoundsException e){
            System.out.println("error " + e);
        }
        return new ArrayList<>(Arrays.asList(softHandTotalVal,hardHandTotalVal));
    }
    private static int getMaxHardSoft(ArrayList<Integer> currSumVal){
        if(currSumVal.get(0) == currSumVal.get(1)){
            return currSumVal.get(0);
        }
        if(currSumVal.get(0) > 21 && currSumVal.get(1) > 21){
            return Math.min(currSumVal.get(1), currSumVal.get(0));
        } else if(currSumVal.get(0) < 21 && currSumVal.get(1) < 21){
            return Math.max(currSumVal.get(1), currSumVal.get(0));
        } else if(currSumVal.get(0) > 21){
            return currSumVal.get(1);
        } else{
            return currSumVal.get(0);
        }
    }
    private static ArrayList<Double> getEV(HashMap<ArrayList<String>, String> ourCards, ArrayList<String> dealerCards){
        ArrayList<Double> retEv = new ArrayList<>();
        // System.out.println(ourCards);
        for(ArrayList<String> currHand : ourCards.keySet()){
            ArrayList<Integer> ourHandVal = getHandVal(currHand);
            ArrayList<Integer> dealerHandVal = getHandVal(dealerCards);
            int maxPlayer = getMaxHardSoft(ourHandVal);
            int maxDealer = getMaxHardSoft(dealerHandVal);

            if((dealerHandVal.get(0) == 21 || dealerHandVal.get(1) == 21) && (ourHandVal.get(0) == 21 || ourHandVal.get(1) ==21))
                retEv.add(0.0);
            else if (ourCards.get(currHand) == "BUST") {
                retEv.add(-1.0);
            }
            else if((ourHandVal.get(0) == 21 || ourHandVal.get(1) ==21) && currHand.size() == 2){
                if(ourCards.get(currHand) == "DOUBLE"){
                    retEv.add(3.0);
                } else {
                    retEv.add(1.5);
                }
            } else if(dealerHandVal.get(0) == 21 || dealerHandVal.get(1) == 21){
                retEv.add(-1.0);
            } else if(ourCards.get(currHand) == "DOUBLE" && getHandVal(currHand).get(1) > 21){
                retEv.add(-2.0);
            } else if(ourCards.get(currHand) == "STAY" && getHandVal(currHand).get(1) > 21){
                retEv.add(-1.0);
            } else if(ourCards.get(currHand) == "SURRENDER"){
                retEv.add(-.5);

            } else if(maxDealer == maxPlayer){
                retEv.add(0.0);
            } else if(maxDealer > maxPlayer){
                if(ourCards.get(currHand) == "DOUBLE"){
                    retEv.add(-2.0);
                } else if(ourCards.get(currHand) == "STAY"){
                    retEv.add(-1.0);
                }
            }else if(maxPlayer > maxDealer){
                if(ourCards.get(currHand) == "DOUBLE"){
                    retEv.add(2.0);
                } else if(ourCards.get(currHand) == "STAY"){
                    retEv.add(1.0);
                }
            }
        }
        // System.out.println(retEv);
        return retEv;
    }

    public static void bjGame(File inFile, File outFile ) throws IOException, NullPointerException
    {

        //init the reader and writer
        BufferedReader br = null;
        BufferedWriter bw = null;

        double sumEV = 0;
        double minloss = 0;
        double maxgain = 0;
        double sumEVNaive = 0;
        double minlossNaive = 0;
        double maxgainNaive = 0;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        br = new BufferedReader(new FileReader(inFile));
        bw = new BufferedWriter(new FileWriter(outFile));

        String line;
        //iterate through all lines in csv
        while ((line = br.readLine()) != null) {
            if(line.length() == 0 ){
                break;
            }
            // System.out.println(line.charAt(0));
            String dealerCard = "";
            //split columns for output
            String[] columns = line.split(",");
            //Check if we can parse the string
            // System.out.println(line.charAt(0));
            if(line.charAt(0) == ',') {
                //            System.out.println(line);
                ArrayList<String> dealerCards = new ArrayList<>();


                if (line.substring(6, 7).equals("1")) {
                    dealerCard = "A";
                } else {
                    dealerCard = line.substring(6, 7).toUpperCase();
                }

                dealerCards.add(dealerCard);
                

                int ourStart = 0;
                int finishSearch = 0;
                //identify the starting index of our cards
                while (ourStart < line.length() && finishSearch < 11) {
                    if (line.charAt(ourStart) == ',') {
                        ourStart++;
                        finishSearch++;
                    } else if (line.charAt(ourStart) == '1') {
                        ourStart += 6;
                        finishSearch++;
                    }
                    // System.out.println(line.charAt(ourStart));
                    // System.out.println(ourStart + " " + finishSearch);
                }
                // System.out.println(line.length());
                String ourCardsList = line.substring(ourStart);

                //delete ending 2 commas if there are any
                while (ourCardsList.charAt(ourCardsList.length() - 1) == ',') {
                    if (ourCardsList.charAt(ourCardsList.length() - 1) == ',') {
                        ourCardsList = ourCardsList.substring(0, ourCardsList.length() - 1);
                    }
                }


                //                String dealerSuit = String.valueOf(dealerCard.charAt(3));
                //                String ourSuit = "";

                //                String dealerVal = String.valueOf(dealerCard.charAt(4));
                ArrayList<String> ourCards = new ArrayList<>();
                //get the values from the hexcode of our cards
               
                String ourVal = "";
                //get the values from the hexcode of our cards
                int adjust = 0;
                boolean canAdd = true;
                for (int chr = 0; chr < ourCardsList.length(); chr++) {
                    if (ourCardsList.charAt(chr) == ',') {
                        adjust += 1;
                        canAdd = true;
                    }
                    if (canAdd) {
                        //                        ourSuit += ourCard.charAt(adjust * 6 + 3);
//                            System.out.println(ourCard.charAt(adjust * 6 + 4));
                        ourVal += ourCardsList.charAt(adjust * 6 + 4);
                        canAdd = false;
                    }
                }


                // System.out.println(ourCards);
                // System.out.println(dealerCards);


                ArrayList<String> absoluteDCards = dealerCards;
                // System.out.println(absoluteDCards);

                

                HashMap<ArrayList<String>, String> finalOurCards = new HashMap<ArrayList<String>, String>();
                sumEV = 0;
                sumEVNaive = 0;
                // System.out.println("before " + sumEV);
                // System.out.println("before1 " + sumEVNaive);


                for(int numRun = 0; numRun < 1000000; numRun ++){


                    for (int j = 0; j < ourVal.length(); j++) {
                        String c = String.valueOf(ourVal.charAt(j));
                        ourCards.add(c.toUpperCase());
                    }

                    ArrayList<Double> res = new ArrayList<>();
                    Deck currDeck = Deck.newDeck();
                    dealerCards = new ArrayList<String>();
                    dealerCards.addAll(absoluteDCards);
                    // System.out.println(currDeck.next().toString());
                    // System.out.println(currDeck);
                    finalOurCards = new HashMap<ArrayList<String>, String>();
                    // System.out.println(ourCards);



                    finalOurCards = playStrategy(currDeck, ourCards, dealerCards);
                    HashMap<ArrayList<String>, String> finalOurCardsNaive = playStrategyNaive(currDeck, ourCards, dealerCards);


                    boolean dealerFinish = false;
                    while(dealerFinish == false){
                        if((getHandVal(dealerCards).get(0) >= 17  && getHandVal(dealerCards).get(0) <=21)|| getHandVal(dealerCards).get(1) > 17 || getHandVal(dealerCards).get(1) > 21){
                            dealerFinish = true;
                        } else {
                            dealerCards.add(currDeck.next().rank().toString());
                        }
                    }
                    

                    // System.out.println(finalOurCards);

                    int tempsum = 0;
                    int tempsumNaive=0;
        
                    for(Double d : getEV(finalOurCards, dealerCards))
                        tempsum += d;
                        // System.out.println(sumEV);

                    for(Double d : getEV(finalOurCardsNaive, dealerCards))
                        tempsumNaive += d;
        
                    sumEV += tempsum;
                    maxgain = Math.max(maxgain, tempsum);
                    minloss = Math.min(minloss, tempsum);
        
                    sumEVNaive += tempsumNaive;
                    maxgainNaive = Math.max(maxgainNaive, tempsumNaive);
                    minlossNaive = Math.max(minlossNaive, tempsumNaive);

                    // System.out.println(finalOurCards);

                    output.clear();
                    res.clear();
                    ourCards.clear();



                }

                Double avg = sumEV / 1000000;
                Double avgNaive = sumEVNaive / 1000000;

                columns[0] = avgNaive.toString();
                columns[1] = avg.toString();

                // System.out.println("after " + sumEV);
                // System.out.println("after1 " + sumEVNaive);


                System.out.println("Wiki:" + avg);
                System.out.println("Naive" + avgNaive);

            }

            bw.write(String.join(",", columns));
            bw.newLine();
        
        }

        
        
            
        // for(int numRun = 0; numRun < 1000000; numRun ++){
        //     ArrayList<Double> res = new ArrayList<>();
        //     Deck currDeck = Deck.newDeck();
        //     ArrayList<String> dealerCards = new ArrayList<>();
        //     ArrayList<String> ourCards = new ArrayList<>();
        //     dealerCards.clear();
        //     ourCards.clear();
        //     res.clear();
        //     int numOthers = Randoms.random().nextInt(4);
        //     // System.out.println(numOthers);
        //     ArrayList<ArrayList<String>> otherPlayerCards = new ArrayList<>();
        //     for(int j = 0; j < numOthers; j ++){
        //         otherPlayerCards.add(new ArrayList<>(Arrays.asList("100","100")));
        //     }
        //     int currItr = 0;
        //     if(currDeck.hasNext() == true){
        //         for(int i = 0; i < 2; i ++){
        //             for(int itr = 0; itr < numOthers; itr ++){
        //                 try{
        //                     String retVal = currDeck.next().rank().toString();
        //                     otherPlayerCards.get(itr).set(currItr, retVal);
        //                 } catch(IndexOutOfBoundsException e){
        //                     System.out.println("Errro: " + e);
        //                 }
        //             }
        //             ourCards.add(currDeck.next().rank().toString());
        //             if(currItr == 0){
        //                 dealerCards.add(currDeck.next().rank().toString());
        //             }
        //             currItr += 1;
        //         }
        //     }



            
        //     ArrayList<String> testOurCards = new ArrayList<>(Arrays.asList("A", "A"));
        //     ArrayList<String> testDealerCards = new ArrayList<>(Arrays.asList("6"));
        //     double EV = 0.0;
        //     double handDollarVal = 1.0;
        //     boolean isComplete = false;
        //     ArrayList<ArrayList<String>> ourCardsVar = new ArrayList<>();
        //     String ourStringComparotorPair2 = "";
        //     String strategy = "";
        //     // System.out.println("other " + otherPlayerCards);
        //     System.out.println("our " + testOurCards);
        //     System.out.println("dealer " + testDealerCards);


        //     output.clear();
        //     HashMap<ArrayList<String>, String> finalOurCards = playStrategy(currDeck, ourCards, dealerCards);

        //     boolean dealerFinish = false;
        //     while(dealerFinish == false){
        //         if((getHandVal(dealerCards).get(0) >= 17  && getHandVal(dealerCards).get(0) <=21)|| getHandVal(dealerCards).get(1) > 17 || getHandVal(dealerCards).get(1) > 21){
        //             dealerFinish = true;
        //         } else {
        //             dealerCards.add(currDeck.next().rank().toString());
        //         }
        //     }

            
        //     // System.out.println(numRun);
        //     // System.out.println(getEV(finalOurCards, dealerCards));
        //     // System.out.println("new our cards " + finalOurCards);
        //     // System.out.println("EV" + getEV(finalOurCards, dealerCards));

        //     int tempsum = 0;
        //     int tempsumNaive=0;

        //     for(Double d : getEV(finalOurCards, dealerCards))
        //         tempsum += d;
        //         // System.out.println(sumEV);
        //     HashMap<ArrayList<String>, String> finalOurCardsNaive = playStrategyNaive(currDeck, ourCards, dealerCards);
        //     for(Double d : getEV(finalOurCardsNaive, dealerCards))
        //         tempsumNaive += d;

        //     sumEV += tempsum;
        //     maxgain = Math.max(maxgain, tempsum);
        //     minloss = Math.min(minloss, tempsum);

        //     sumEVNaive += tempsumNaive;
        //     maxgainNaive = Math.max(maxgainNaive, tempsumNaive);
        //     minlossNaive = Math.max(minlossNaive, tempsumNaive);
        // }    
        // Double avg = sumEV / 1000000;
        // Double avgNaive = sumEVNaive / 1000000;
        // System.out.println(avg);
        // System.out.println("LOSS " + minloss + " " + "MAX " + maxgain);
        // System.out.println("avgNaive " + avgNaive);
        // System.out.println("LOSS " + minlossNaive + " " + "MAX " + maxgainNaive);

        br.close();
        bw.close();


    }

    static HashMap<ArrayList<String>, String> output = new HashMap<ArrayList<String>, String>();

    private static HashMap<ArrayList<String>, String> playStrategy(Deck currDeck, ArrayList<String> ourCards, ArrayList<String> dealerCards) {

        Hashtable<String, String[]> hardVals = new Hashtable<>();
        Hashtable<String, String[]> softVals = new Hashtable<>();
        Hashtable<String, String> doubleVals = new Hashtable<>();
        
        hardVals.put("21A", new String[]{"STAY", "STAY"});
        hardVals.put("212", new String[]{"STAY", "STAY"});
        hardVals.put("213", new String[]{"STAY", "STAY"});
        hardVals.put("214", new String[]{"STAY", "STAY"});
        hardVals.put("215", new String[]{"STAY", "STAY"});
        hardVals.put("216", new String[]{"STAY", "STAY"});
        hardVals.put("217", new String[]{"STAY", "STAY"});
        hardVals.put("218", new String[]{"STAY", "STAY"});
        hardVals.put("219", new String[]{"STAY", "STAY"});
        hardVals.put("2110", new String[]{"STAY", "STAY"});
        hardVals.put("20A", new String[]{"STAY", "STAY"});
        hardVals.put("202", new String[]{"STAY", "STAY"});
        hardVals.put("203", new String[]{"STAY", "STAY"});
        hardVals.put("204", new String[]{"STAY", "STAY"});
        hardVals.put("205", new String[]{"STAY", "STAY"});
        hardVals.put("206", new String[]{"STAY", "STAY"});
        hardVals.put("207", new String[]{"STAY", "STAY"});
        hardVals.put("208", new String[]{"STAY", "STAY"});
        hardVals.put("209", new String[]{"STAY", "STAY"});
        hardVals.put("2010", new String[]{"STAY", "STAY"});
        hardVals.put("19A", new String[]{"STAY", "STAY"});
        hardVals.put("192", new String[]{"STAY", "STAY"});
        hardVals.put("193", new String[]{"STAY", "STAY"});
        hardVals.put("194", new String[]{"STAY", "STAY"});
        hardVals.put("195", new String[]{"STAY", "STAY"});
        hardVals.put("196", new String[]{"STAY", "STAY"});
        hardVals.put("197", new String[]{"STAY", "STAY"});
        hardVals.put("198", new String[]{"STAY", "STAY"});
        hardVals.put("199", new String[]{"STAY", "STAY"});
        hardVals.put("1910", new String[]{"STAY", "STAY"});
        hardVals.put("18A", new String[]{"STAY", "STAY"});
        hardVals.put("182", new String[]{"STAY", "STAY"});
        hardVals.put("183", new String[]{"STAY", "STAY"});
        hardVals.put("184", new String[]{"STAY", "STAY"});
        hardVals.put("185", new String[]{"STAY", "STAY"});
        hardVals.put("186", new String[]{"STAY", "STAY"});
        hardVals.put("187", new String[]{"STAY", "STAY"});
        hardVals.put("188", new String[]{"STAY", "STAY"});
        hardVals.put("189", new String[]{"STAY", "STAY"});
        hardVals.put("1810", new String[]{"STAY", "STAY"});
        hardVals.put("17A", new String[]{"SURRENDER", "STAY"});
        hardVals.put("172", new String[]{"STAY", "STAY"});
        hardVals.put("173", new String[]{"STAY", "STAY"});
        hardVals.put("174", new String[]{"STAY", "STAY"});
        hardVals.put("175", new String[]{"STAY", "STAY"});
        hardVals.put("176", new String[]{"STAY", "STAY"});
        hardVals.put("177", new String[]{"STAY", "STAY"});
        hardVals.put("178", new String[]{"STAY", "STAY"});
        hardVals.put("179", new String[]{"STAY", "STAY"});
        hardVals.put("1710", new String[]{"STAY", "STAY"});
        hardVals.put("17K", new String[]{"STAY", "STAY"});
        hardVals.put("16A", new String[]{"SURRENDER", "HIT"});
        hardVals.put("162", new String[]{"STAY", "STAY"});
        hardVals.put("163", new String[]{"STAY", "STAY"});
        hardVals.put("164", new String[]{"STAY", "STAY"});
        hardVals.put("165", new String[]{"STAY", "STAY"});
        hardVals.put("166", new String[]{"STAY", "STAY"});
        hardVals.put("167", new String[]{"HIT", "HIT"});
        hardVals.put("168", new String[]{"HIT", "HIT"});
        hardVals.put("169", new String[]{"SURRENDER", "HIT"});
        hardVals.put("1610", new String[]{"SURRENDER", "HIT"});
        hardVals.put("15A", new String[]{"SURRENDER", "HIT"});
        hardVals.put("152", new String[]{"STAY", "STAY"});
        hardVals.put("153", new String[]{"STAY", "STAY"});
        hardVals.put("154", new String[]{"STAY", "STAY"});
        hardVals.put("155", new String[]{"STAY", "STAY"});
        hardVals.put("156", new String[]{"STAY", "STAY"});
        hardVals.put("157", new String[]{"HIT", "HIT"});
        hardVals.put("158", new String[]{"HIT", "HIT"});
        hardVals.put("159", new String[]{"HIT", "HIT"});
        hardVals.put("1510", new String[]{"SURRENDER", "HIT"});
        hardVals.put("14A", new String[]{"HIT", "HIT"});
        hardVals.put("142", new String[]{"STAY", "STAY"});
        hardVals.put("143", new String[]{"STAY", "STAY"});
        hardVals.put("144", new String[]{"STAY", "STAY"});
        hardVals.put("145", new String[]{"STAY", "STAY"});
        hardVals.put("146", new String[]{"STAY", "STAY"});
        hardVals.put("147", new String[]{"HIT", "HIT"});
        hardVals.put("148", new String[]{"HIT", "HIT"});
        hardVals.put("149", new String[]{"HIT", "HIT"});
        hardVals.put("1410", new String[]{"HIT", "HIT"});
        hardVals.put("13A", new String[]{"HIT", "HIT"});
        hardVals.put("132", new String[]{"STAY", "STAY"});
        hardVals.put("133", new String[]{"STAY", "STAY"});
        hardVals.put("134", new String[]{"STAY", "STAY"});
        hardVals.put("135", new String[]{"STAY", "STAY"});
        hardVals.put("136", new String[]{"STAY", "STAY"});
        hardVals.put("137", new String[]{"HIT", "HIT"});
        hardVals.put("138", new String[]{"HIT", "HIT"});
        hardVals.put("139", new String[]{"HIT", "HIT"});
        hardVals.put("1310", new String[]{"HIT", "HIT"});
        hardVals.put("12A", new String[]{"HIT", "HIT"});
        hardVals.put("122", new String[]{"HIT", "HIT"});
        hardVals.put("123", new String[]{"HIT", "HIT"});
        hardVals.put("124", new String[]{"STAY", "STAY"});
        hardVals.put("125", new String[]{"STAY", "STAY"});
        hardVals.put("126", new String[]{"STAY", "STAY"});
        hardVals.put("127", new String[]{"HIT", "HIT"});
        hardVals.put("128", new String[]{"HIT", "HIT"});
        hardVals.put("129", new String[]{"HIT", "HIT"});
        hardVals.put("1210", new String[]{"HIT", "HIT"});
        hardVals.put("11A", new String[]{"DOUBLE", "HIT"});
        hardVals.put("112", new String[]{"DOUBLE", "HIT"});
        hardVals.put("113", new String[]{"DOUBLE", "HIT"});
        hardVals.put("114", new String[]{"DOUBLE", "HIT"});
        hardVals.put("115", new String[]{"DOUBLE", "HIT"});
        hardVals.put("116", new String[]{"DOUBLE", "HIT"});
        hardVals.put("117", new String[]{"DOUBLE", "HIT"});
        hardVals.put("118", new String[]{"DOUBLE", "HIT"});
        hardVals.put("119", new String[]{"DOUBLE", "HIT"});
        hardVals.put("1110", new String[]{"DOUBLE", "HIT"});
        hardVals.put("10A", new String[]{"HIT", "HIT"});
        hardVals.put("102", new String[]{"DOUBLE", "HIT"});
        hardVals.put("103", new String[]{"DOUBLE", "HIT"});
        hardVals.put("104", new String[]{"DOUBLE", "HIT"});
        hardVals.put("105", new String[]{"DOUBLE", "HIT"});
        hardVals.put("106", new String[]{"DOUBLE", "HIT"});
        hardVals.put("107", new String[]{"DOUBLE", "HIT"});
        hardVals.put("108", new String[]{"DOUBLE", "HIT"});
        hardVals.put("109", new String[]{"DOUBLE", "HIT"});
        hardVals.put("1010", new String[]{"HIT", "HIT"});
        hardVals.put("9A", new String[]{"HIT", "HIT"});
        hardVals.put("92", new String[]{"HIT", "HIT"});
        hardVals.put("93", new String[]{"DOUBLE", "HIT"});
        hardVals.put("94", new String[]{"DOUBLE", "HIT"});
        hardVals.put("95", new String[]{"DOUBLE", "HIT"});
        hardVals.put("96", new String[]{"DOUBLE", "HIT"});
        hardVals.put("97", new String[]{"HIT", "HIT"});
        hardVals.put("98", new String[]{"HIT", "HIT"});
        hardVals.put("99", new String[]{"HIT", "HIT"});
        hardVals.put("910", new String[]{"HIT", "HIT"});
        hardVals.put("8A", new String[]{"HIT", "HIT"});
        hardVals.put("82", new String[]{"HIT", "HIT"});
        hardVals.put("83", new String[]{"HIT", "HIT"});
        hardVals.put("84", new String[]{"HIT", "HIT"});
        hardVals.put("85", new String[]{"HIT", "HIT"});
        hardVals.put("86", new String[]{"HIT", "HIT"});
        hardVals.put("87", new String[]{"HIT", "HIT"});
        hardVals.put("88", new String[]{"HIT", "HIT"});
        hardVals.put("89", new String[]{"HIT", "HIT"});
        hardVals.put("810", new String[]{"HIT", "HIT"});
        hardVals.put("7A", new String[]{"HIT", "HIT"});
        hardVals.put("72", new String[]{"HIT", "HIT"});
        hardVals.put("73", new String[]{"HIT", "HIT"});
        hardVals.put("74", new String[]{"HIT", "HIT"});
        hardVals.put("75", new String[]{"HIT", "HIT"});
        hardVals.put("76", new String[]{"HIT", "HIT"});
        hardVals.put("77", new String[]{"HIT", "HIT"});
        hardVals.put("78", new String[]{"HIT", "HIT"});
        hardVals.put("79", new String[]{"HIT", "HIT"});
        hardVals.put("710", new String[]{"HIT", "HIT"});
        hardVals.put("6A", new String[]{"HIT", "HIT"});
        hardVals.put("62", new String[]{"HIT", "HIT"});
        hardVals.put("63", new String[]{"HIT", "HIT"});
        hardVals.put("64", new String[]{"HIT", "HIT"});
        hardVals.put("65", new String[]{"HIT", "HIT"});
        hardVals.put("66", new String[]{"HIT", "HIT"});
        hardVals.put("67", new String[]{"HIT", "HIT"});
        hardVals.put("68", new String[]{"HIT", "HIT"});
        hardVals.put("69", new String[]{"HIT", "HIT"});
        hardVals.put("610", new String[]{"HIT", "HIT"});
        hardVals.put("5A", new String[]{"HIT", "HIT"});
        hardVals.put("52", new String[]{"HIT", "HIT"});
        hardVals.put("53", new String[]{"HIT", "HIT"});
        hardVals.put("54", new String[]{"HIT", "HIT"});
        hardVals.put("55", new String[]{"HIT", "HIT"});
        hardVals.put("56", new String[]{"HIT", "HIT"});
        hardVals.put("57", new String[]{"HIT", "HIT"});
        hardVals.put("58", new String[]{"HIT", "HIT"});
        hardVals.put("59", new String[]{"HIT", "HIT"});
        hardVals.put("510", new String[]{"HIT", "HIT"});

        softVals.put("20A", new String[]{"STAY", "STAY"});
        softVals.put("202", new String[]{"STAY", "STAY"});
        softVals.put("203", new String[]{"STAY", "STAY"});
        softVals.put("204", new String[]{"STAY", "STAY"});
        softVals.put("205", new String[]{"STAY", "STAY"});
        softVals.put("206", new String[]{"STAY", "STAY"});
        softVals.put("207", new String[]{"STAY", "STAY"});
        softVals.put("208", new String[]{"STAY", "STAY"});
        softVals.put("209", new String[]{"STAY", "STAY"});
        softVals.put("2010", new String[]{"STAY", "STAY"});
        softVals.put("19A", new String[]{"STAY", "STAY"});
        softVals.put("192", new String[]{"STAY", "STAY"});
        softVals.put("193", new String[]{"STAY", "STAY"});
        softVals.put("194", new String[]{"STAY", "STAY"});
        softVals.put("195", new String[]{"STAY", "STAY"});
        softVals.put("196", new String[]{"DOUBLE", "HIT"});
        softVals.put("197", new String[]{"STAY", "STAY"});
        softVals.put("198", new String[]{"STAY", "STAY"});
        softVals.put("199", new String[]{"STAY", "STAY"});
        softVals.put("1910", new String[]{"STAY", "STAY"});
        softVals.put("18A", new String[]{"HIT", "HIT"});
        softVals.put("182", new String[]{"DOUBLE", "STAY"});
        softVals.put("183", new String[]{"DOUBLE", "STAY"});
        softVals.put("184", new String[]{"DOUBLE", "STAY"});
        softVals.put("185", new String[]{"DOUBLE", "STAY"});
        softVals.put("186", new String[]{"DOUBLE", "STAY"});
        softVals.put("187", new String[]{"STAY", "STAY"});
        softVals.put("188", new String[]{"STAY", "STAY"});
        softVals.put("189", new String[]{"HIT", "HIT"});
        softVals.put("1810", new String[]{"HIT", "HIT"});
        softVals.put("17A", new String[]{"HIT", "HIT"});
        softVals.put("172", new String[]{"HIT", "HIT"});
        softVals.put("173", new String[]{"DOUBLE", "HIT"});
        softVals.put("174", new String[]{"DOUBLE", "HIT"});
        softVals.put("175", new String[]{"DOUBLE", "HIT"});
        softVals.put("176", new String[]{"DOUBLE", "HIT"});
        softVals.put("177", new String[]{"HIT", "HIT"});
        softVals.put("178", new String[]{"HIT", "HIT"});
        softVals.put("179", new String[]{"HIT", "HIT"});
        softVals.put("1710", new String[]{"HIT", "HIT"});
        softVals.put("16A", new String[]{"HIT", "HIT"});
        softVals.put("162", new String[]{"HIT", "HIT"});
        softVals.put("163", new String[]{"HIT", "HIT"});
        softVals.put("164", new String[]{"DOUBLE", "HIT"});
        softVals.put("165", new String[]{"DOUBLE", "HIT"});
        softVals.put("166", new String[]{"DOUBLE", "HIT"});
        softVals.put("167", new String[]{"HIT", "HIT"});
        softVals.put("168", new String[]{"HIT", "HIT"});
        softVals.put("169", new String[]{"HIT", "HIT"});
        softVals.put("1610", new String[]{"HIT", "HIT"});
        softVals.put("15A", new String[]{"HIT", "HIT"});
        softVals.put("152", new String[]{"HIT", "HIT"});
        softVals.put("153", new String[]{"HIT", "HIT"});
        softVals.put("154", new String[]{"DOUBLE", "HIT"});
        softVals.put("155", new String[]{"DOUBLE", "HIT"});
        softVals.put("156", new String[]{"DOUBLE", "HIT"});
        softVals.put("157", new String[]{"HIT", "HIT"});
        softVals.put("158", new String[]{"HIT", "HIT"});
        softVals.put("159", new String[]{"HIT", "HIT"});
        softVals.put("1510", new String[]{"HIT", "HIT"});
        softVals.put("14A", new String[]{"HIT", "HIT"});
        softVals.put("142", new String[]{"HIT", "HIT"});
        softVals.put("143", new String[]{"HIT", "HIT"});
        softVals.put("144", new String[]{"HIT", "HIT"});
        softVals.put("145", new String[]{"DOUBLE", "HIT"});
        softVals.put("146", new String[]{"DOUBLE", "HIT"});
        softVals.put("147", new String[]{"HIT", "HIT"});
        softVals.put("148", new String[]{"HIT", "HIT"});
        softVals.put("149", new String[]{"HIT", "HIT"});
        softVals.put("1410", new String[]{"HIT", "HIT"});
        softVals.put("13A", new String[]{"HIT", "HIT"});
        softVals.put("132", new String[]{"HIT", "HIT"});
        softVals.put("133", new String[]{"HIT", "HIT"});
        softVals.put("134", new String[]{"HIT", "HIT"});
        softVals.put("135", new String[]{"DOUBLE", "HIT"});
        softVals.put("136", new String[]{"DOUBLE", "HIT"});
        softVals.put("137", new String[]{"HIT", "HIT"});
        softVals.put("138", new String[]{"HIT", "HIT"});
        softVals.put("139", new String[]{"HIT", "HIT"});
        softVals.put("1310", new String[]{"HIT", "HIT"});

        doubleVals.put("AA", "SPLIT");
        doubleVals.put("A2", "SPLIT");
        doubleVals.put("A3", "SPLIT");
        doubleVals.put("A4", "SPLIT");
        doubleVals.put("A5", "SPLIT");
        doubleVals.put("A6", "SPLIT");
        doubleVals.put("A7", "SPLIT");
        doubleVals.put("A8", "SPLIT");
        doubleVals.put("A9", "SPLIT");
        doubleVals.put("A10", "SPLIT");
        doubleVals.put("10A", "STAY");
        doubleVals.put("102", "STAY");
        doubleVals.put("103", "STAY");
        doubleVals.put("104", "STAY");
        doubleVals.put("105", "STAY");
        doubleVals.put("106", "STAY");
        doubleVals.put("107", "STAY");
        doubleVals.put("108", "STAY");
        doubleVals.put("109", "STAY");
        doubleVals.put("1010", "STAY");
        doubleVals.put("JA", "STAY");
        doubleVals.put("J2", "STAY");
        doubleVals.put("J3", "STAY");
        doubleVals.put("J4", "STAY");
        doubleVals.put("J5", "STAY");
        doubleVals.put("J6", "STAY");
        doubleVals.put("J7", "STAY");
        doubleVals.put("J8", "STAY");
        doubleVals.put("J9", "STAY");
        doubleVals.put("J10", "STAY");
        doubleVals.put("QA", "STAY");
        doubleVals.put("Q2", "STAY");
        doubleVals.put("Q3", "STAY");
        doubleVals.put("Q4", "STAY");
        doubleVals.put("Q5", "STAY");
        doubleVals.put("Q6", "STAY");
        doubleVals.put("Q7", "STAY");
        doubleVals.put("Q8", "STAY");
        doubleVals.put("Q9", "STAY");
        doubleVals.put("Q10", "STAY");
        doubleVals.put("KA", "STAY");
        doubleVals.put("K2", "STAY");
        doubleVals.put("K3", "STAY");
        doubleVals.put("K4", "STAY");
        doubleVals.put("K5", "STAY");
        doubleVals.put("K6", "STAY");
        doubleVals.put("K7", "STAY");
        doubleVals.put("K8", "STAY");
        doubleVals.put("K9", "STAY");
        doubleVals.put("K10", "STAY");
        doubleVals.put("9A", "STAY");
        doubleVals.put("92", "SPLIT");
        doubleVals.put("93", "SPLIT");
        doubleVals.put("94", "SPLIT");
        doubleVals.put("95", "SPLIT");
        doubleVals.put("96", "SPLIT");
        doubleVals.put("97", "STAY");
        doubleVals.put("98", "SPLIT");
        doubleVals.put("99", "SPLIT");
        doubleVals.put("910", "STAY");
        doubleVals.put("8A", "SURRENDER");
        doubleVals.put("82", "SPLIT");
        doubleVals.put("83", "SPLIT");
        doubleVals.put("84", "SPLIT");
        doubleVals.put("85", "SPLIT");
        doubleVals.put("86", "SPLIT");
        doubleVals.put("87", "SPLIT");
        doubleVals.put("88", "SPLIT");
        doubleVals.put("89", "SPLIT");
        doubleVals.put("810", "SPLIT");
        doubleVals.put("7A", "HIT");
        doubleVals.put("72", "SPLIT");
        doubleVals.put("73", "SPLIT");
        doubleVals.put("74", "SPLIT");
        doubleVals.put("75", "SPLIT");
        doubleVals.put("76", "SPLIT");
        doubleVals.put("77", "SPLIT");
        doubleVals.put("78", "HIT");
        doubleVals.put("79", "HIT");
        doubleVals.put("710", "HIT");
        doubleVals.put("6A", "HIT");
        doubleVals.put("62", "SPLIT");
        doubleVals.put("63", "SPLIT");
        doubleVals.put("64", "SPLIT");
        doubleVals.put("65", "SPLIT");
        doubleVals.put("66", "SPLIT");
        doubleVals.put("67", "HIT");
        doubleVals.put("68", "HIT");
        doubleVals.put("69", "HIT");
        doubleVals.put("610", "HIT");
        doubleVals.put("5A", "HIT");
        doubleVals.put("52", "DOUBLE");
        doubleVals.put("53", "DOUBLE");
        doubleVals.put("54", "DOUBLE");
        doubleVals.put("55", "DOUBLE");
        doubleVals.put("56", "DOUBLE");
        doubleVals.put("57", "DOUBLE");
        doubleVals.put("58", "DOUBLE");
        doubleVals.put("59", "DOUBLE");
        doubleVals.put("510", "HIT");
        doubleVals.put("4A", "HIT");
        doubleVals.put("42", "HIT");
        doubleVals.put("43", "HIT");
        doubleVals.put("44", "HIT");
        doubleVals.put("45", "SPLIT");
        doubleVals.put("46", "SPLIT");
        doubleVals.put("47", "HIT");
        doubleVals.put("48", "HIT");
        doubleVals.put("49", "HIT");
        doubleVals.put("410", "HIT");
        doubleVals.put("3A", "HIT");
        doubleVals.put("32", "SPLIT");
        doubleVals.put("33", "SPLIT");
        doubleVals.put("34", "SPLIT");
        doubleVals.put("35", "SPLIT");
        doubleVals.put("36", "SPLIT");
        doubleVals.put("37", "SPLIT");
        doubleVals.put("38", "HIT");
        doubleVals.put("39", "HIT");
        doubleVals.put("310", "HIT");
        doubleVals.put("2A", "HIT");
        doubleVals.put("22", "SPLIT");
        doubleVals.put("23", "SPLIT");
        doubleVals.put("24", "SPLIT");
        doubleVals.put("25", "SPLIT");
        doubleVals.put("26", "SPLIT");
        doubleVals.put("27", "SPLIT");
        doubleVals.put("28", "HIT");
        doubleVals.put("29", "HIT");
        doubleVals.put("210", "HIT");

        ArrayList<Integer> ourVals = getHandVal(ourCards);
        // ArrayList<Integer> dealerVals = getHandVal(dealerCards);

        // System.out.println("ourV " + ourVals);
        String ourStringComparotorPair = "";
        //also need to c hekc that we oinly have 2 cards fgor a pair

        ArrayList<String> currCards = new ArrayList<String>();
        currCards = ourCards;


        if(currCards.get(0).equals(currCards.get(1))){
            if(currCards.get(0).equals("A") || currCards.get(0).equals("B") || currCards.get(0).equals("D") || currCards.get(0).equals("E") 
            || currCards.get(0).equals("J") || currCards.get(0).equals("Q") || currCards.get(0).equals("K")){
                ourStringComparotorPair += "10";
            } else{
                ourStringComparotorPair += currCards.get(0);
            }
            if(dealerCards.get(0).equals("A") || dealerCards.get(0).equals("B") || dealerCards.get(0).equals("D") || dealerCards.get(0).equals("E") 
            || dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")){
                ourStringComparotorPair += "10";
            } else{
                ourStringComparotorPair += dealerCards.get(0);
            }
        }
        String ourStringComparotorRest = "";
        int softHandTotalVal = ourVals.get(0);
        int hardHandTotalVal = ourVals.get(1);
        int handNumCount = ourVals.size();
        String decision = "";

        if (hardHandTotalVal > 21) {
            // System.out.println("BUST");
            output.put(currCards, "BUST");
            return output;
        }


        if (softHandTotalVal == 21 || hardHandTotalVal == 21) {
            // System.out.println("BLACKJACK");
            decision = "STAY";
        }

        else if (!ourStringComparotorPair.equals("")) {
            decision = doubleVals.get(ourStringComparotorPair);
        }

        

        else if (softHandTotalVal != hardHandTotalVal && softHandTotalVal > 10 && softHandTotalVal <= 20) {
            String keyVal = "";
            if (dealerCards.get(0).equals("A") || dealerCards.get(0).equals("B") || dealerCards.get(0).equals("D") || dealerCards.get(0).equals("E")
            || dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
                keyVal = String.valueOf(softHandTotalVal) + "10";
            } else {
                keyVal = (String.valueOf(softHandTotalVal) + dealerCards.get(0));
                
            }
            if (handNumCount == 2) {
                decision = softVals.get(keyVal)[0];
            } else {
                decision = softVals.get(keyVal)[1];
            }

        } else {
            String keyVal = "";
            if (dealerCards.get(0).equals("A") || dealerCards.get(0).equals("B") || dealerCards.get(0).equals("D") || dealerCards.get(0).equals("E") 
            || dealerCards.get(0).equals("J") || dealerCards.get(0).equals("Q") || dealerCards.get(0).equals("K")) {
                keyVal = String.valueOf(hardHandTotalVal) + "10";
            } else {
                keyVal = (String.valueOf(hardHandTotalVal) + dealerCards.get(0)).toUpperCase();
            }
            if (handNumCount == 2){
                decision = hardVals.get(keyVal)[0];
            } else {
                decision = hardVals.get(keyVal)[1];
            }
        }

        // System.out.println(decision);
        // System.out.println(currCards.get(1));


        if (decision == "STAY"){
            output.put(currCards,  "STAY");
            // System.out.println(output);

        } else if (decision == "DOUBLE") {
            currCards.add(currDeck.next().rank().toString());
            output.put(currCards, "DOUBLE");

        } else if (decision == "SURRENDER") {
            output.put(currCards, "SURRENDER");
        } else if (decision == "HIT") {
            currCards.add(currDeck.next().rank().toString());

            playStrategy(currDeck, currCards, dealerCards);
        } else if (decision == "SPLIT") {
            ArrayList<String> hand1 = new ArrayList<String>(Arrays.asList(currCards.get(0)));
            hand1.add(currDeck.next().rank().toString());
            playStrategy(currDeck, hand1, dealerCards);
            ArrayList<String> hand2 = new ArrayList<String>(Arrays.asList(currCards.get(1)));
            hand2.add(currDeck.next().rank().toString());
            playStrategy(currDeck, hand2, dealerCards);
            // System.out.println("new our cards " + hand1 + " " + hand2);


        }



        // System.out.println(currCards);
        // System.out.println(output);
        ArrayList<String> error = new ArrayList<String>();
        error.add("failed");

        // System.out.println(output);


        return output;


    }

    private static HashMap<ArrayList<String>, String> playStrategyNaive(Deck currDeck, ArrayList<String> ourCards, ArrayList<String> dealerCards){
        HashMap<ArrayList<String>, String> outputNaive = new HashMap<ArrayList<String>, String>();

        ArrayList<String> currCards = new ArrayList<String>();
        currCards = ourCards;


        int hardHandTotalVal = getHandVal(currCards).get(1);
        int softHandTotalVal = getHandVal(currCards).get(0);
        if(hardHandTotalVal > 21){
            outputNaive.put(currCards, "BUST");
        }
        else if (hardHandTotalVal > 11) {
            outputNaive.put(currCards, "STAY");
        } else {
            if (softHandTotalVal > 17) {
                outputNaive.put(currCards, "STAY");
            } else {
                currCards.add(currDeck.next().rank().toString());
                playStrategyNaive(currDeck, currCards, dealerCards);
            }
        }
        return outputNaive;
    }

    public static void main(String[] args) throws Exception {
        //Define in and out file absolute paths
        File inFile = new File(
            "/Users/thush/Downloads/hw4.csv");
        File outFile = new File(
            "/Users/thush/Desktop/COMP_380_HW_4_Output_2.csv");

        bjGame(inFile, outFile);

    }

}
