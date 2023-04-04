public class GetEnv {
    public static void main(String[] argv) {
        String envVarName = argv.length == 0 ? "PATH" : argv[0];
        System.out.printf("System.getenv(\"%s\") = %s\n",
                envVarName, System.getenv(envVarName));
    }
}