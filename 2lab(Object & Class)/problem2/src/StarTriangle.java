public class StarTriangle {

    public int n;
    StarTriangle(int n) {

        this.n = n;

    }
        public String toString()
        {
            String arr = "";
            int q = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <=i; j++) {
                    arr += "[*]";
                }
                arr += "\n";
                ///this.ladder[i] = arr;
            }
            return arr;
        }
    }

