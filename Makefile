JFLAGS = -g
JC = javac
.SUFFIXES: .java .class

compile:
	$(JC) $(JFLAGS) BDDB.java
	
run:
	java -cp .:sqlite-jdbc-3.7.15-M1.jar BDDB

clean:
	rm -rf BDDB/BDDB.class BDDB/pkg/*/*.class

archive:
	make clean
	tar -f BDDB.ZANZI.TRUONG.tar.gz -cvz ../BDDB
