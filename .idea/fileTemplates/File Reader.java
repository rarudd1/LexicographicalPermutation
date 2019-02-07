public static void main(String[] args) throws IOException {


        try (Scanner scanner = new Scanner(new FileReader("tests.txt"))) {


            int testCases = scanner.nextInt();

            for(int i=0; i<testCases; i++)
            {
                int testSize = scanner.nextInt();
                long[][] containers = new long[testSize][testSize];
                for (int j = 0; j < testSize; j++) {
                        for(int k =0; k< testSize; k++) {
                        containers[j][k] = scanner.nextInt();
                        }
                    }
                    System.out.println(ballswap(containers));
            }

        }
    }