TestMod
=======

Dummy Addon Example for Battlegear2

This is the core of what is "necesary" for an addon of https://github.com/Mine-and-blade-admin/Battlegear2, in short steps:

-Add compiled jar into your mod gradle setup (preferably in eclipse.mods folder, so it can run in debug)

-Add it as library and use them in your mod sources

-Use FML @Optional(modid="battlegear2" so the interfaces or methods can be stripped out when the mod isn't loaded, and take special care about mod load order

-Put the jar dependency in build.gradle so it can be built by Gradle
