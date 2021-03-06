package com.ssitcloud.business.common.util;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
//这里用到了JAXB的核心类和方法，不懂可以去查看下JAXB基础应用，
//这里只做关键解释。
public class JaxbToXmlUtil {
	public static String convertToXml(Object obj, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
            //去掉生成xml的默认报文头。
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            //转换所有的适配字符，包括xml实体字符&lt;和&gt;，xml实体字符在好多处理xml
            //的框架中是处理不了的，除非序列化。
            marshaller.setProperty("com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler",
                    new CharacterEscapeHandler() {
                @Override
                public void escape(char[] ch, int start,int length, boolean isAttVal,
                        Writer writer) throws IOException {
                    writer.write(ch, start, length);
                }
            });
            StringWriter writer = new StringWriter();
            //添加自己想要的xml报文头
            //writer.write("<?xml version=\'1.0\' encoding=\'" + encoding + "\'?>\n");
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return result;
    }
	public static String convertToXmlByte(Object obj, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
            //去掉生成xml的默认报文头。
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            //转换所有的适配字符，包括xml实体字符&lt;和&gt;，xml实体字符在好多处理xml
            //的框架中是处理不了的，除非序列化。
            marshaller.setProperty("com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler",
                    new CharacterEscapeHandler() {
                @Override
                public void escape(char[] ch, int start,int length, boolean isAttVal,
                        Writer writer) throws IOException {
                    writer.write(ch, start, length);
                }
            });
            StringWriter writer = new StringWriter();
            //添加自己想要的xml报文头
            writer.write("<?xml version=\'1.0\' encoding=\'" + encoding + "\'?>\n");
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return result;
    }
}