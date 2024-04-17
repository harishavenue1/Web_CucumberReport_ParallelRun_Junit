mvn clean verify

To set the thread count to a specific number instead of useUnlimitedThreads use the below setting.
<configuration>
    <parallel>methods</parallel>
    <threadCount>4</threadCount>
</configuration>
The thread count in the above setting is 4 threads per core.
