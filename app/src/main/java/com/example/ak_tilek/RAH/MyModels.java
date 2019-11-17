package com.example.ak_tilek.RAH;

public class MyModels {

      private String subgect, techname;
         private long start, end;

        public String getSubgect() {
            return subgect;
        }

        public String getTechname() {
            return techname;
        }

        public long getStartTime() {
            return start;
        }

        public long getEndTime() {
            return start;
        }

        public MyModels(String subgect, String techname, long start, long end) {
            this.subgect = subgect;
            this.techname = techname;
            this.start = start;
            this.end = end;
    }
}