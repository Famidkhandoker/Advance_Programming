class VowelThread extends Thread {
    People p;

    VowelThread(People p) {
        this.p = p;
    }

    public void run() {
        System.out.println("Thread Name: " + getName());
        System.out.println("Priority: " + getPriority());

        String str = p.getName().toLowerCase();
        int count = 0;

        // Count vowels
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("Total vowels: " + count);

        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

        System.out.println("Vowels are:");

        // Print vowels with delay
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c);

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {}
            }
        }
    }
}