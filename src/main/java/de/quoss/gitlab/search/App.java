package de.quoss.gitlab.search;

import picocli.CommandLine;

@CommandLine.Command
public class App implements Runnable {

    @CommandLine.Option(names = {"-n", "--needle"}, description = "Needle to search in haystack", required = true)
    String needle;

    @CommandLine.Option(names = {"-p", "--path"}, description = "Path to projects to search", required = true)
    String path;

    @Override
    public void run() {
        System.out.format("We are going to search for needle '%s' in any haystack of projects in path '%s'.\n", needle,
                path);
    }

}
