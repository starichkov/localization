# Localization

This repository contains example how to use enum constants as keys for localization.

# Example

1. Create property file:
<pre>example.properties</pre>

2. Add one sample message to it:
<pre>// example.properties
HELLO=Hello!
</pre>

3. Create enum and annotate it (with base name of your resource):
<pre>@BaseName(value = "example")
public enum Example {
    HELLO
}
</pre>

3. Use the following method to get localized message from resource by enum constant (as key):
<pre>String message = L10N.getMessage(Example.HELLO);</pre>

That's it! Enjoy!