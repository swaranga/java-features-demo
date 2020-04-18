package org.java.features.demo.process_api;

import java.util.Arrays;

public class Java9 {
    public static void main(String[] args) throws Exception {
        printProcessDetails(ProcessHandle.current());

        printProcessDetails(new ProcessBuilder("firefox").inheritIO().start().toHandle());
    }

    private static void printProcessDetails(ProcessHandle processHandle) {
        ProcessHandle.Info processInfo = processHandle.info();

        System.out.println("Pid: " + processHandle.pid());
        System.out.println("Command: " + processInfo.command().orElse("<no command found>"));
        System.out.println("Args: " + Arrays.toString(processInfo.arguments().orElseGet(() -> new String[0])));

        System.out.println("Start: " + processInfo.startInstant().orElse(null));
        System.out.println("Duration: " + processInfo.totalCpuDuration().orElse(null));
        System.out.println("User: " + processInfo.user().orElse("unknown"));
    }
}
