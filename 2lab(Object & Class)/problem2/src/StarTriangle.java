public class StarTriangle {
    String[] ladder;
    StarTriangle(int n) {
        String arr = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr += "[*]";
            }
            this.ladder[i] = arr;
        }
    }
        public void toString()
        {
            for(int i =0;i<ladder.length;i++)
            {
                System.out.println(ladder[i]);
            }
        }
    }
}
