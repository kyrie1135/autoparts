package com.mixone.api.util;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class SignUtil {
    public static String src = "hbxy12334qt543";


    public static String publicKey = "305C300D06092A864886F70D0101010500034B0030480241008A448BC5EE37339627A6729054490F53538A0BFFAF07379847B55BBF102E8A9A11003CA01B8406FC418B0406DD64A9B1CACF186F8FD469EA578FA0CD528C1D0B0203010001";
    public static String privateKey = "";


    public static void main(String[] args) {
        try {
            // 密钥初始化
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(512);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
            RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();


            System.out.println("rsaPublicKey:" + HexBin.encode(rsaPublicKey.getEncoded()));
            System.out.println("rsaPrivateKey:" + HexBin.encode(rsaPrivateKey.getEncoded()));

            byte[] arr = sign(src.getBytes(), HexBin.decode(privateKey));
            System.out.println("jdk rsa sign:" + HexBin.encode(arr));


            boolean bool = verify(src.getBytes(), arr, HexBin.decode(publicKey));
            System.out.println("jdk rsa verify:" + bool);


        } catch (Exception e) {

        }
    }


    public static boolean verify(byte[] data, byte[] sign, byte[] rsaPublicKey) {
        try {
            KeyFactory keyFactory;
            Signature signature;
            // 验证签名
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(rsaPublicKey);
            keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
            signature = Signature.getInstance("MD5withRSA");
            signature.initVerify(publicKey);
            signature.update(data);
            return signature.verify(sign);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //签名
    private static byte[] sign(byte[] data, byte[] rsaPrivateKey) throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(rsaPrivateKey);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(privateKey);
        signature.update(data);
        return signature.sign();
    }
}