package batfish.representation.cisco;

import batfish.representation.Ip;

public class IpBgpPeerGroup extends BgpPeerGroup {

   private static final long serialVersionUID = 1L;

   private String _groupName;
   private Ip _ip;
   private String _peerTemplateName;  //allowing for only one template for now
   
   public IpBgpPeerGroup(Ip ip) {
      _ip = ip;
   }

   public String getGroupName() {
      return _groupName;
   }

   public Ip getIp() {
      return _ip;
   }

   public String getPeerTemplateName() {
      return _peerTemplateName;
   }

   @Override
   public String getName() {
      return _ip.toString();
   }

   public void setGroupName(String name) {
      _groupName = name;
   }

   public void setPeerTemplateName(String name) {
      _peerTemplateName = name;
   }
}
