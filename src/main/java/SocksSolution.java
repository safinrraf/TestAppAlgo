import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class SocksSolution {
    static int sockMerchant(int n, int[] ar) {
        final int[] ar1 = new int[101];
        int t = 0;
        for (int ii : ar1)
            ar1[ii] = 0;

        for (int ii : ar)
            ar1[ii]++;

        for (int ii : ar1) {
            if (ii > 1)
                t += ii / 2;
        }
        return t;
    }

    public static String photoSolution(String s) {
        String result = "";
        class Photo implements Comparable {
            private String photoName;
            private final String city;
            private final LocalDateTime photoTime;
            private String origStr;

            Photo(String photoInfo) {
                origStr = photoInfo;
                final String[] infoArr = photoInfo.split(",");
                this.photoName = infoArr[1].trim() + "." + infoArr[0].split("\\.")[1];
                this.city = infoArr[1].trim();
                final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                this.photoTime = LocalDateTime.parse(infoArr[2].trim(), formatter);
            }

            @Override
            public int compareTo(Object o) {
                final LocalDateTime localDateTime = ((Photo) o).photoTime;
                return this.photoTime.compareTo(localDateTime);
            }
        }
        final Map<String, Integer> cityMapOccurence = new HashMap<>();
        final String[] strings = s.split("\n");
        final ArrayList<Photo> photoArrayList = new ArrayList<>(100);
        for (String photo : strings) {
            final Photo newPhoto = new Photo(photo);
            if (cityMapOccurence.containsKey(newPhoto.city)) {
                Integer cnt = cityMapOccurence.get(newPhoto.city);
                cityMapOccurence.replace(newPhoto.city, ++cnt);
            } else {
                cityMapOccurence.put(newPhoto.city, 1);
            }
            photoArrayList.add(newPhoto);
        }
        for (Map.Entry<String, Integer> entry : cityMapOccurence.entrySet()) {
            final List<Photo> lPhoto =
                    photoArrayList
                            .stream()
                            .filter(t -> t.city.equals(entry.getKey()))
                            .sorted()
                            .collect(Collectors.toList());
            lPhoto.forEach(sp -> {
                photoArrayList
                        .stream()
                        .filter(pp -> pp.origStr.equals(sp.origStr))
                        .forEach(pp -> pp.photoName = pp.photoName.split("\\.")[0]
                                + String.format("%0" + String.valueOf(entry.getValue()).length() + "d", lPhoto.indexOf(sp) + 1)
                                + "."
                                + pp.photoName.split("\\.")[1]);
            });
        }
        for (Photo p : photoArrayList) {
            result += p.photoName + "\n";
        }
        return result.substring(0, result.length() - 1);
    }

    public static int binaryGap(int N) {
        if ((N != 0) && ((N & (N - 1)) == 0))
            return 0;
        if(N==1 || N==0)
            return 0;
        int gap=0;
        N >>>= Integer.numberOfTrailingZeros(N);
        while ((N & (N + 1)) != 0) {
            N |= N >>> 1;
            gap++;
        }
        return gap;
    }
};