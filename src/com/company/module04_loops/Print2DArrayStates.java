package com.company.module04_loops;

public class Print2DArrayStates {
    public static void main(String[] args) {

        String [][] states = {{"CA","OR","WA","ON","NY","SC"},
				              {"IL","FL","NJ","VA","TX"},
				              {"RI","PA","MA","NC","BC", "AZ"}};


        for (int i=0;i<states.length;i++){
            for(int j=0;j<states[i].length;j++)
            {
                System.out.print(states[i][j] + "\t");
            }
            System.out.println();
        }


        //use of nested for each

        for(String []US_States:states){
            for(String state:US_States){
                System.out.println(state + "  using nested for each ");
            }

        }



    }


}
