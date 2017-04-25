# MCUpdate
Welcome to the MCUpdate github page. This page contains the MCUpdate class that you need for sending info to MCUpdate.org.

## Install
1. Copy the [MCUpdate.java](https://raw.githubusercontent.com/kicjow/MCUpdate/master/src/com/songoda/mcupdate/MCUpdate.java) class into your project.
2. Copy and paste this into your onEnable().
⋅⋅⋅try {
⋅⋅⋅ 	MCUpdate update = new MCUpdate(this, true);
⋅⋅⋅} catch (IOException e) {
⋅⋅⋅ 	System.out.println("MCUpdate failed to load.");
⋅⋅⋅}
3. Compile the plugin and load it onyo your server.
4. Go to the [Claim Page](http://mcupdate.org/?a=claim) on MCUpdate.org and put in your plugins information.
5. Hit claim plugin and voila you claimed the plugin as your.

## TroubleShooting
1. Keep getting this error "This plugin is either already claimed or wasnt found."
⋅⋅* Make sure you have ran the plugin on a server connected to the internet at least once. You may need to wait a couple of minutes before you can claim it.
