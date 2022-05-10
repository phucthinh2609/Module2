package Bai21_DesignPattern.facade;

public class Main {
    public static void main(String[] args) {
        SocialMediaShare socialMediaShare = new SocialMediaShare(new FacebookShare(), new TwitterShare());
        socialMediaShare.share("Hello ");
    }
}
