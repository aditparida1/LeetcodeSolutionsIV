
package leetcodesolutionsiv;
import java.util.*;

public class LeetcodeSolutionsIV
{
    public static void main(String[] args)
    {
        //System.out.println(new isIdealPermutation775().isIdealPermutation(new int[]{1,0,3,2,4,6,5,8,7,10,9,12,11,13,15,14,16,18,17,19,20,21,23,22,25,24,26,27,28,29,30,32,31,33,35,34,37,36,39,38,41,40,43,42,44,45,47,46,49,48,50,51,53,52,55,54,56,58,57,59,61,60,62,64,63,65,66,67,68,69,70,71,72,73,75,74,76,77,78,80,79,81,82,84,83,86,85,87,89,88,90,92,91,94,93,95,96,97,98,100,99,101,103,102,105,104,107,106,108,109,110,112,111,114,113,115,116,118,117,120,119,122,121,124,123,125,126,128,127,129,131,130,133,132,134,135,137,136,138,140,139,141,143,142,144,146,145,148,147,149,151,150,152,154,153,155,157,156,158,159,160,161,162,164,163,166,165,167,168,170,169,172,171,174,173,175,177,176,179,178,181,180,183,182,185,184,186,187,188,190,189,191,192,193,194,195,196,197,198,200,199,202,201,204,203,206,205,207,209,208,210,212,211,213,214,215,217,216,219,218,221,220,223,222,224,226,225,227,229,228,230,232,231,233,235,234,237,236,239,238,240,242,241,243,245,244,247,246,248,250,249,252,251,253,255,254,257,256,258,259,260,262,261,263,264,265,267,266,269,268,271,270,273,272,275,274,277,276,279,278,280,282,281,284,283,285,287,286,288,290,289,291,293,292,295,294,297,296,299,298,300,301,302,303,305,304,306,308,307,310,309,312,311,313,315,314,316,317,318,320,319,322,321,323,325,324,326,327,329,328,330,332,331,334,333,336,335,337,339,338,341,340,343,342,344,346,345,348,347,350,349,352,351,354,353,356,355,357,358,359,360,362,361,363,364,366,365,367,369,368,370,372,371,373,375,374,376,378,377,380,379,381,383,382,384,386,385,387,389,388,391,390,393,392,395,394,397,396,398,399,400,401,402,403,404,405,406,408,407,409,410,412,411,414,413,416,415,417,419,418,421,420,422,423,425,424,426,427,428,429,430,431,432,434,433,435,437,436,438,439,440,441,442,443,445,444,446,447,449,448,451,450,453,452,454,455,456,457,459,458,461,460,462,463,465,464,467,466,469,468,471,470,473,472,474,476,475,478,477,480,479,482,481,483,484,486,485,487,488,489,490,491,492,493,495,494,497,496,498,500,499,501,503,502,504,505,506,507,509,508,510,511,512,514,513,516,515,518,517,520,519,522,521,524,523,525,526,527,529,528,531,530,533,532,534,535,537,536,538,540,539,541,542,543,545,544,546,547,548,549,550,551,552,554,553,555,556,557,559,558,561,560,562,563,565,564,566,567,569,568,571,570,573,572,574,576,575,577,579,578,581,580,582,584,583,585,587,586,589,588,591,590,593,592,594,595,596,598,597,599,601,600,602,603,605,604,606,608,607,609,611,610,612,614,613,615,616,617,619,618,621,620,622,624,623,625,627,626,628,629,630,631,632,634,633,635,637,636,638,640,639,641,643,642,645,644,646,647,648,649,650,652,651,653,655,654,656,657,658,659,660,661,662,664,663,665,666,667,669,668,671,670,673,672,674,676,675,677,678,679,680,682,681,683,684,686,685,687,689,688,691,690,692,693,695,694,697,696,698,700,699,701,702,703,704,706,705,707,708,710,709,712,711,714,713,715,716,718,717,720,719,721,723,722,724,726,725,727,729,728,730,731,732,733,735,734,736,737,739,738,741,740,743,742,744,746,745,747,749,748,750,752,751,754,753,756,755,757,759,758,761,760,763,762,765,764,767,766,769,768,770,771,772,774,773,775,776,777,779,778,781,780,783,782,785,784,786,788,787,790,789,791,793,792,795,794,796,797,799,798,801,800,802,804,803,806,805,807,809,808,811,810,812,814,813,815,816,818,817,819,820,822,821,824,823,825,826,828,827,830,829,831,833,832,835,834,836,837,839,838,840,842,841,844,843,845,846,847,849,848,851,850,852,853,855,854,857,856,859,858,860,861,863,862,864,866,865,867,868,870,869,872,871,874,873,875,876,877,878,880,879,881,882,884,883,885,886,888,887,889,891,890,892,894,893,895,896,898,897,900,899,901,902,903,905,904,906,907,908,910,909,912,911,914,913,915,916,917,918,920,919,921,922,924,923,926,925,928,927,930,929,932,931,934,933,936,935,938,937,939,941,940,942,943,945,944,946,947,949,948,950,951,952,953,954,956,955,957,959,958,961,960,963,962,965,964,966,967,968,969,971,970,973,972,975,974,976,978,977,980,979,982,981,983,984,986,985,987,988,990,989,991,993,992,995,994,997,996,998,1000,999,1001,1002,1003,1005,1004,1007,1006,1009,1008,1011,1010,1012,1013,1014,1016,1015,1017,1018,1019,1021,1020,1022,1024,1023,1025,1027,1026,1029,1028,1030,1031,1032,1033,1035,1034,1036,1038,1037,1039,1041,1040,1042,1044,1043,1046,1045,1048,1047,1049,1051,1050,1053,1052,1055,1054,1056,1058,1057,1060,1059,1061,1063,1062,1064,1066,1065,1067,1068,1070,1069,1072,1071,1073,1075,1074,1076,1077,1078,1080,1079,1081,1083,1082,1084,1086,1085,1087,1088,1089,1090,1092,1091,1094,1093,1096,1095,1098,1097,1100,1099,1102,1101,1104,1103,1105,1106,1107,1108,1110,1109,1111,1113,1112,1115,1114,1116,1118,1117,1119,1121,1120,1123,1122,1125,1124,1126,1127,1129,1128,1131,1130,1133,1132,1134,1136,1135,1137,1138,1139,1141,1140,1143,1142,1144,1145,1146,1147,1149,1148,1151,1150,1153,1152,1154,1155,1157,1156,1158,1160,1159,1162,1161,1164,1163,1166,1165,1168,1167,1169,1170,1171,1172,1173,1175,1174,1177,1176,1179,1178,1181,1180,1182,1183,1185,1184,1186,1187,1188,1190,1189,1192,1191,1193,1195,1194,1197,1196,1199,1198,1201,1200,1203,1202,1205,1204,1207,1206,1208,1209,1211,1210,1212,1214,1213,1215,1216,1218,1217,1219,1220,1221,1223,1222,1225,1224,1226,1227,1229,1228,1231,1230,1233,1232,1234,1235,1236,1238,1237,1240,1239,1242,1241,1244,1243,1245,1247,1246,1248,1250,1249,1252,1251,1253,1254,1255,1256,1258,1257,1259,1261,1260,1262,1263,1264,1265,1267,1266,1269,1268,1270,1271,1272,1274,1273,1275,1277,1276,1278,1280,1279,1282,1281,1283,1285,1284,1286,1287,1288,1290,1289,1292,1291,1294,1293,1296,1295,1297,1298,1299,1301,1300,1303,1302,1304,1305,1306,1308,1307,1310,1309,1311,1313,1312,1314,1316,1315,1317,1319,1318,1320,1322,1321,1324,1323,1325,1326,1327,1329,1328,1330,1332,1331,1333,1334,1335,1337,1336,1339,1338,1341,1340,1343,1342,1345,1344,1346,1348,1347,1349,1350,1351,1352,1354,1353,1355,1356,1357,1358,1360,1359,1362,1361,1363,1364,1365,1367,1366,1369,1368,1371,1370,1373,1372,1375,1374,1376,1378,1377,1379,1380,1382,1381,1383,1384,1385,1387,1386,1388,1390,1389,1391,1392,1394,1393,1395,1397,1396,1398,1400,1399,1402,1401,1403,1405,1404,1407,1406,1408,1410,1409,1412,1411,1414,1413,1416,1415,1418,1417,1419,1421,1420,1422,1424,1423,1425,1426,1428,1427,1429,1430,1432,1431,1434,1433,1435,1437,1436,1439,1438,1440,1442,1441,1444,1443,1445,1446,1448,1447,1449,1451,1450,1453,1452,1454,1455,1456,1457,1458,1460,1459,1461,1462,1463,1464,1466,1465,1468,1467,1470,1469,1471,1472,1474,1473,1476,1475,1478,1477,1479,1481,1480,1483,1482,1484,1485,1487,1486,1489,1488,1490,1492,1491,1494,1493,1496,1495,1497,1498,1499,1501,1500,1503,1502,1505,1504,1506,1507,1508,1510,1509,1511,1512,1514,1513,1515,1517,1516,1519,1518,1520,1521,1522,1524,1523,1525,1527,1526,1528,1530,1529,1532,1531,1533,1535,1534,1537,1536,1538,1539,1541,1540,1543,1542,1544,1545,1547,1546,1549,1548,1550,1551,1552,1554,1553,1556,1555,1557,1559,1558,1561,1560,1562,1563,1564,1566,1565,1568,1567,1569,1571,1570,1573,1572,1575,1574,1576,1577,1578,1580,1579,1582,1581,1583,1584,1586,1585,1588,1587,1589,1590,1592,1591,1594,1593,1595,1596,1597,1598,1599,1601,1600,1602,1603,1604,1606,1605,1607,1608,1610,1609,1612,1611,1613,1615,1614,1616,1618,1617,1620,1619,1622,1621,1623,1624,1625,1626,1627,1628,1630,1629,1632,1631,1633,1634,1635,1637,1636,1639,1638,1641,1640,1643,1642,1645,1644,1647,1646,1649,1648,1651,1650,1652,1654,1653,1656,1655,1658,1657,1660,1659,1662,1661,1663,1665,1664,1667,1666,1669,1668,1670,1671,1673,1672,1675,1674,1677,1676,1678,1680,1679,1681,1682,1684,1683,1685,1687,1686,1689,1688,1691,1690,1692,1693,1695,1694,1696,1698,1697,1699,1701,1700,1703,1702,1704,1706,1705,1707,1709,1708,1711,1710,1712,1713,1715,1714,1717,1716,1719,1718,1720,1722,1721,1724,1723,1726,1725,1728,1727,1729,1731,1730,1732,1733,1735,1734,1737,1736,1739,1738,1740,1741,1743,1742,1745,1744,1747,1746,1748,1749,1750,1752,1751,1754,1753,1755,1757,1756,1758,1760,1759,1761,1763,1762,1765,1764,1767,1766,1768,1770,1769,1771,1773,1772,1775,1774,1777,1776,1778,1779,1781,1780,1783,1782,1784,1786,1785,1787,1789,1788,1791,1790,1793,1792,1795,1794,1796,1797,1798,1799,1800,1802,1801,1803,1804,1806,1805,1807,1809,1808,1811,1810,1813,1812,1815,1814,1817,1816,1819,1818,1821,1820,1822,1823,1825,1824,1827,1826,1828,1829,1830,1832,1831,1834,1833,1836,1835,1837,1839,1838,1841,1840,1843,1842,1845,1844,1847,1846,1848,1850,1849,1851,1852,1854,1853,1855,1856,1858,1857,1860,1859,1862,1861,1864,1863,1865,1867,1866,1869,1868,1870,1871,1873,1872,1875,1874,1877,1876,1879,1878,1880,1881,1882,1883,1885,1884,1886,1888,1887,1889,1890,1892,1891,1894,1893,1895,1897,1896,1898,1899,1901,1900,1903,1902,1905,1904,1907,1906,1909,1908,1911,1910,1913,1912,1914,1916,1915,1918,1917,1920,1919,1921,1923,1922,1925,1924,1927,1926,1929,1928,1931,1930,1932,1933,1934,1935,1937,1936,1938,1939,1941,1940,1943,1942,1944,1946,1945,1947,1948,1950,1949,1952,1951,1954,1953,1955,1956,1958,1957,1959,1960,1961,1962,1963,1965,1964,1966,1968,1967,1970,1969,1971,1972,1974,1973,1976,1975,1978,1977,1979,1980,1982,1981,1984,1983,1985,1987,1986,1989,1988,1991,1990,1992,1994,1993,1996,1995,1997,1998,2000,1999,2001,2003,2002,2005,2004,2006,2007,2008,2009,2011,2010,2013,2012,2015,2014,2017,2016,2019,2018,2021,2020,2023,2022,2024,2025,2026,2028,2027,2030,2029,2031,2032,2033,2035,2034,2036,2038,2037,2039,2041,2040,2043,2042,2044,2045,2046,2047,2049,2048,2050,2052,2051,2053,2054,2056,2055,2058,2057,2060,2059,2062,2061,2063,2064,2065,2066,2068,2067,2070,2069,2071,2073,2072,2075,2074,2076,2078,2077,2080,2079,2081,2083,2082,2084,2086,2085,2088,2087,2089,2091,2090,2093,2092,2095,2094,2096,2098,2097,2100,2099,2102,2101,2103,2104,2105,2107,2106,2108,2110,2109,2112,2111,2113,2114,2115,2117,2116,2119,2118,2120,2122,2121,2123,2124,2126,2125,2127,2128,2129,2130,2131,2133,2132,2135,2134,2137,2136,2138,2140,2139,2142,2141,2144,2143,2146,2145,2147,2149,2148,2151,2150,2152,2154,2153,2156,2155,2158,2157,2160,2159,2161,2162,2164,2163,2165,2166,2168,2167,2169,2171,2170,2173,2172,2174,2176,2175,2177,2178,2179,2181,2180,2182,2184,2183,2186,2185,2188,2187,2189,2190,2191,2192,2194,2193,2195,2196,2198,2197,2200,2199,2201,2202,2204,2203,2205,2206,2208,2207,2209,2211,2210,2213,2212,2214,2216,2215,2218,2217,2220,2219,2222,2221,2224,2223,2226,2225,2227,2228,2229,2231,2230,2232,2234,2233,2236,2235,2238,2237,2239,2240,2242,2241,2243,2245,2244,2246,2248,2247,2249,2251,2250,2253,2252,2254,2256,2255,2258,2257,2260,2259,2261,2263,2262,2265,2264,2266,2268,2267,2270,2269,2271,2272,2273,2275,2274,2276,2277,2279,2278,2281,2280,2282,2283,2285,2284,2287,2286,2289,2288,2291,2290,2293,2292,2295,2294,2296,2297,2299,2298,2301,2300,2302,2304,2303,2306,2305,2307,2309,2308,2310,2311,2313,2312,2314,2315,2317,2316,2318,2320,2319,2322,2321,2324,2323,2325,2327,2326,2329,2328,2330,2332,2331,2334,2333,2336,2335,2338,2337,2339,2340,2342,2341,2343,2345,2344,2347,2346,2349,2348,2350,2351,2352,2354,2353,2356,2355,2358,2357,2359,2361,2360,2362,2364,2363,2366,2365,2368,2367,2370,2369,2371,2373,2372,2375,2374,2377,2376,2379,2378,2381,2380,2382,2384,2383,2386,2385,2388,2387,2389,2390,2392,2391,2394,2393,2396,2395,2397,2399,2398,2401,2400,2402,2404,2403,2406,2405,2408,2407,2410,2409,2411,2413,2412,2414,2416,2415,2418,2417,2419,2421,2420,2423,2422,2424,2425,2426,2427,2428,2430,2429,2431,2433,2432,2434,2435,2436,2437,2438,2439,2440,2441,2442,2444,2443,2446,2445,2448,2447,2450,2449,2451,2452,2453,2455,2454,2456,2457,2459,2458,2460,2461,2462,2463,2465,2464,2466,2468,2467,2470,2469,2472,2471,2473,2475,2474,2477,2476,2478,2479,2481,2480,2482,2483,2485,2484,2487,2486,2489,2488,2490,2492,2491,2494,2493,2495,2496,2497,2498,2499,2501,2500,2502,2504,2503,2506,2505,2508,2507,2509,2510,2511,2512,2513,2514,2516,2515,2517,2518,2519,2520,2522,2521,2523,2525,2524,2527,2526,2529,2528,2531,2530,2533,2532,2535,2534,2536,2537,2539,2538,2541,2540,2543,2542,2545,2544,2546,2548,2547,2549,2550,2551,2553,2552,2555,2554,2556,2557,2558,2560,2559,2561,2563,2562,2564,2565,2567,2566,2568,2569,2571,2570,2572,2573,2575,2574,2577,2576,2578,2579,2580,2581,2583,2582,2584,2585,2586,2588,2587,2589,2590,2592,2591,2594,2593,2596,2595,2598,2597,2600,2599,2602,2601,2603,2605,2604,2606,2607,2608,2609,2611,2610,2613,2612,2615,2614,2617,2616,2618,2619,2621,2620,2622,2624,2623,2625,2626,2628,2627,2629,2631,2630,2633,2632,2635,2634,2636,2638,2637,2640,2639,2641,2642,2643,2644,2645,2647,2646,2649,2648,2651,2650,2652,2654,2653,2655,2656,2658,2657,2660,2659,2661,2663,2662,2665,2664,2667,2666,2668,2670,2669,2671,2673,2672,2674,2676,2675,2677,2678,2679,2681,2680,2683,2682,2685,2684,2687,2686,2689,2688,2691,2690,2692,2693,2694,2695,2697,2696,2699,2698,2700,2701,2703,2702,2705,2704,2706,2707,2708,2710,2709,2712,2711,2714,2713,2715,2717,2716,2719,2718,2721,2720,2723,2722,2725,2724,2726,2728,2727,2730,2729,2732,2731,2734,2733,2736,2735,2738,2737,2739,2741,2740,2742,2744,2743,2746,2745,2747,2748,2749,2750,2752,2751,2754,2753,2756,2755,2758,2757,2759,2760,2762,2761,2763,2765,2764,2766,2768,2767,2770,2769,2771,2773,2772,2774,2775,2776,2778,2777,2780,2779,2782,2781,2784,2783,2785,2787,2786,2788,2790,2789,2791,2792,2793,2795,2794,2797,2796,2798,2799,2800,2801,2803,2802,2805,2804,2807,2806,2808,2810,2809,2811,2812,2814,2813,2815,2817,2816,2818,2820,2819,2821,2822,2823,2824,2826,2825,2828,2827,2829,2830,2831,2832,2833,2834,2835,2837,2836,2838,2840,2839,2842,2841,2843,2844,2845,2847,2846,2848,2850,2849,2852,2851,2853,2855,2854,2856,2857,2859,2858,2860,2861,2863,2862,2865,2864,2867,2866,2869,2868,2871,2870,2872,2874,2873,2876,2875,2878,2877,2880,2879,2881,2883,2882,2884,2886,2885,2888,2887,2889,2890,2891,2892,2893,2895,2894,2897,2896,2899,2898,2900,2902,2901,2904,2903,2905,2906,2907,2908,2910,2909,2912,2911,2914,2913,2915,2917,2916,2919,2918,2920,2922,2921,2923,2925,2924,2927,2926,2928,2929,2930,2932,2931,2934,2933,2936,2935,2937,2939,2938,2940,2941,2942,2943,2945,2944,2946,2948,2947,2949,2951,2950,2952,2954,2953,2955,2957,2956,2959,2958,2960,2962,2961,2963,2965,2964,2966,2967,2968,2970,2969,2972,2971,2973,2974,2976,2975,2978,2977,2980,2979,2981,2982,2984,2983,2986,2985,2988,2987,2990,2989,2992,2991,2994,2993,2995,2997,2996,2999,2998,3001,3000,3002,3004,3003,3006,3005,3008,3007,3009,3010,3012,3011,3014,3013,3015,3016,3018,3017,3019,3020,3022,3021,3023,3025,3024,3026,3027,3028,3029,3031,3030,3033,3032,3034,3036,3035,3038,3037,3039,3041,3040,3043,3042,3044,3045,3047,3046,3048,3050,3049,3052,3051,3054,3053,3056,3055,3058,3057,3060,3059,3062,3061,3063,3065,3064,3067,3066,3068,3069,3071,3070,3072,3074,3073,3076,3075,3078,3077,3079,3081,3080,3083,3082,3085,3084,3086,3087,3088,3089,3090,3091,3092,3093,3094,3095,3097,3096,3098,3099,3100,3102,3101,3103,3105,3104,3107,3106,3108,3110,3109,3111,3113,3112,3114,3115,3116,3118,3117,3120,3119,3121,3123,3122,3125,3124,3127,3126,3128,3130,3129,3131,3133,3132,3135,3134,3137,3136,3138,3140,3139,3142,3141,3143,3145,3144,3147,3146,3149,3148,3151,3150,3152,3153,3155,3154,3156,3158,3157,3159,3161,3160,3162,3163,3164,3166,3165,3168,3167,3169,3171,3170,3173,3172,3175,3174,3176,3177,3179,3178,3181,3180,3183,3182,3184,3185,3186,3187,3189,3188,3191,3190,3192,3193,3194,3195,3197,3196,3199,3198,3200,3201,3202,3204,3203,3206,3205,3207,3209,3208,3210,3212,3211,3214,3213,3216,3215,3217,3219,3218,3221,3220,3223,3222,3224,3226,3225,3227,3228,3230,3229,3231,3233,3232,3235,3234,3237,3236,3239,3238,3240,3242,3241,3243,3245,3244,3246,3247,3248,3249,3250,3252,3251,3254,3253,3256,3255,3257,3258,3260,3259,3262,3261,3264,3263,3265,3266,3268,3267,3270,3269,3272,3271,3273,3274,3275,3276,3277,3279,3278,3281,3280,3282,3283,3285,3284,3287,3286,3288,3290,3289,3291,3292,3293,3294,3295,3297,3296,3299,3298,3300,3301,3303,3302,3305,3304,3306,3308,3307,3310,3309,3311,3313,3312,3315,3314,3316,3317,3318,3319,3321,3320,3323,3322,3324,3326,3325,3328,3327,3330,3329,3332,3331,3334,3333,3335,3337,3336,3338,3339,3340,3341,3342,3343,3345,3344,3347,3346,3348,3350,3349,3352,3351,3354,3353,3355,3356,3358,3357,3359,3361,3360,3363,3362,3365,3364,3367,3366,3368,3370,3369,3371,3372,3374,3373,3376,3375,3378,3377,3380,3379,3382,3381,3384,3383,3385,3386,3387,3388,3390,3389,3392,3391,3393,3395,3394,3396,3398,3397,3399,3400,3402,3401,3404,3403,3406,3405,3408,3407,3410,3409,3411,3413,3412,3414,3416,3415,3418,3417,3419,3421,3420,3422,3423,3424,3426,3425,3428,3427,3430,3429,3432,3431,3433,3435,3434,3436,3438,3437,3439,3440,3442,3441,3444,3443,3445,3447,3446,3449,3448,3451,3450,3453,3452,3455,3454,3456,3457,3459,3458,3460,3461,3463,3462,3464,3465,3467,3466,3469,3468,3470,3471,3472,3473,3475,3474,3476,3477,3479,3478,3481,3480,3483,3482,3485,3484,3487,3486,3489,3488,3490,3492,3491,3493,3495,3494,3496,3498,3497,3499,3501,3500,3502,3504,3503,3505,3507,3506,3509,3508,3510,3511,3512,3513,3515,3514,3516,3518,3517,3519,3521,3520,3523,3522,3525,3524,3527,3526,3528,3529,3531,3530,3533,3532,3534,3536,3535,3538,3537,3539,3540,3542,3541,3544,3543,3545,3546,3548,3547,3550,3549,3552,3551,3554,3553,3555,3556,3557,3559,3558,3560,3561,3563,3562,3564,3566,3565,3567,3568,3569,3571,3570,3572,3573,3575,3574,3576,3578,3577,3580,3579,3582,3581,3584,3583,3586,3585,3588,3587,3590,3589,3592,3591,3593,3594,3596,3595,3598,3597,3600,3599,3602,3601,3603,3605,3604,3606,3607,3608,3609,3610,3612,3611,3613,3614,3615,3617,3616,3618,3619,3620,3621,3622,3624,3623,3625,3627,3626,3629,3628,3630,3631,3633,3632,3634,3636,3635,3638,3637,3640,3639,3641,3642,3644,3643,3646,3645,3647,3648,3649,3650,3652,3651,3653,3655,3654,3656,3657,3659,3658,3661,3660,3663,3662,3664,3665,3666,3667,3669,3668,3671,3670,3673,3672,3674,3675,3677,3676,3679,3678,3681,3680,3682,3684,3683,3685,3686,3687,3689,3688,3690,3692,3691,3694,3693,3695,3697,3696,3698,3699,3701,3700,3703,3702,3705,3704,3707,3706,3708,3709,3710,3712,3711,3714,3713,3716,3715,3718,3717,3719,3720,3722,3721,3723,3724,3725,3727,3726,3729,3728,3731,3730,3732,3733,3735,3734,3736,3738,3737,3739,3741,3740,3742,3744,3743,3745,3746,3747,3749,3748,3751,3750,3753,3752,3755,3754,3757,3756,3758,3760,3759,3761,3762,3763,3764,3766,3765,3767,3769,3768,3771,3770,3772,3774,3773,3776,3775,3778,3777,3779,3781,3780,3782,3784,3783,3786,3785,3787,3788,3789,3790,3792,3791,3794,3793,3795,3797,3796,3798,3800,3799,3802,3801,3804,3803,3806,3805,3808,3807,3810,3809,3812,3811,3813,3814,3815,3817,3816,3818,3819,3821,3820,3822,3823,3825,3824,3827,3826,3829,3828,3831,3830,3832,3834,3833,3835,3836,3838,3837,3840,3839,3841,3843,3842,3844,3846,3845,3848,3847,3850,3849,3851,3853,3852,3854,3856,3855,3858,3857,3860,3859,3861,3863,3862,3865,3864,3866,3868,3867,3869,3871,3870,3872,3874,3873,3875,3876,3878,3877,3880,3879,3882,3881,3884,3883,3885,3886,3888,3887,3890,3889,3892,3891,3894,3893,3896,3895,3898,3897,3900,3899,3901,3902,3904,3903,3906,3905,3907,3908,3909,3910,3912,3911,3914,3913,3915,3917,3916,3919,3918,3920,3922,3921,3923,3925,3924,3927,3926,3928,3929,3930,3932,3931,3934,3933,3935,3937,3936,3939,3938,3941,3940,3942,3943,3944,3946,3945,3948,3947,3949,3951,3950,3953,3952,3955,3954,3956,3958,3957,3960,3959,3962,3961,3963,3965,3964,3967,3966,3968,3970,3969,3972,3971,3973,3975,3974,3976,3978,3977,3980,3979,3982,3981,3984,3983,3985,3987,3986,3989,3988,3991,3990,3993,3992,3994,3996,3995,3997,3998,3999,4001,4000,4003,4002,4005,4004,4007,4006,4009,4008,4010,4011,4012,4013,4015,4014,4017,4016,4018,4019,4021,4020,4022,4023,4025,4024,4027,4026,4029,4028,4030,4032,4031,4033,4035,4034,4036,4037,4039,4038,4041,4040,4043,4042,4044,4045,4046,4048,4047,4049,4051,4050,4052,4054,4053,4055,4056,4057,4059,4058,4061,4060,4062,4064,4063,4066,4065,4067,4069,4068,4071,4070,4072,4074,4073,4075,4077,4076,4078,4080,4079,4082,4081,4083,4085,4084,4087,4086,4089,4088,4090,4092,4091,4094,4093,4096,4095,4097,4099,4098,4101,4100,4102,4104,4103,4105,4107,4106,4108,4110,4109,4112,4111,4114,4113,4116,4115,4117,4119,4118,4121,4120,4122,4123,4124,4125,4126,4127,4129,4128,4130,4131,4133,4132,4134,4136,4135,4138,4137,4140,4139,4141,4143,4142,4145,4144,4146,4147,4148,4150,4149,4152,4151,4154,4153,4155,4157,4156,4158,4159,4160,4161,4162,4163,4164,4166,4165,4168,4167,4169,4171,4170,4172,4174,4173,4176,4175,4177,4179,4178,4181,4180,4182,4183,4185,4184,4187,4186,4188,4189,4190,4192,4191,4194,4193,4196,4195,4197,4198,4200,4199,4201,4202,4204,4203,4206,4205,4208,4207,4209,4211,4210,4212,4213,4214,4215,4216,4217,4218,4219,4221,4220,4222,4224,4223,4226,4225,4227,4228,4230,4229,4232,4231,4234,4233,4236,4235,4237,4239,4238,4240,4241,4243,4242,4244,4246,4245,4247,4248,4249,4251,4250,4253,4252,4254,4256,4255,4257,4258,4259,4260,4262,4261,4264,4263,4265,4267,4266,4269,4268,4270,4271,4273,4272,4274,4275,4276,4277,4279,4278,4280,4281,4282,4283,4284,4285,4286,4288,4287,4290,4289,4291,4292,4293,4295,4294,4296,4297,4299,4298,4301,4300,4302,4303,4305,4304,4306,4308,4307,4309,4310,4311,4313,4312,4314,4315,4316,4317,4318,4320,4319,4321,4322,4323,4324,4326,4325,4327,4329,4328,4331,4330,4332,4334,4333,4335,4337,4336,4339,4338,4341,4340,4343,4342,4345,4344,4347,4346,4349,4348,4351,4350,4353,4352,4354,4355,4357,4356,4358,4360,4359,4361,4362,4363,4365,4364,4367,4366,4368,4370,4369,4371,4373,4372,4374,4375,4376,4377,4378,4380,4379,4382,4381,4384,4383,4386,4385,4388,4387,4390,4389,4391,4392,4393,4395,4394,4397,4396,4399,4398,4400,4401,4403,4402,4405,4404,4406,4407,4409,4408,4410,4412,4411,4414,4413,4415,4417,4416,4419,4418,4421,4420,4422,4423,4425,4424,4427,4426,4429,4428,4430,4431,4433,4432,4434,4436,4435,4437,4438,4440,4439,4441,4443,4442,4445,4444,4447,4446,4449,4448,4450,4451,4452,4454,4453,4455,4456,4457,4458,4459,4460,4461,4462,4463,4465,4464,4466,4468,4467,4469,4471,4470,4472,4473,4475,4474,4477,4476,4479,4478,4481,4480,4483,4482,4484,4485,4486,4488,4487,4490,4489,4491,4493,4492,4494,4496,4495,4497,4499,4498,4501,4500,4502,4504,4503,4505,4506,4507,4509,4508,4510,4512,4511,4513,4515,4514,4517,4516,4519,4518,4521,4520,4522,4524,4523,4525,4526,4528,4527,4530,4529,4532,4531,4534,4533,4535,4537,4536,4538,4539,4540,4542,4541,4543,4544,4546,4545,4548,4547,4549,4551,4550,4553,4552,4555,4554,4556,4557,4558,4560,4559,4561,4562,4564,4563,4566,4565,4568,4567,4569,4571,4570,4572,4574,4573,4575,4576,4577,4579,4578,4581,4580,4582,4584,4583,4586,4585,4587,4589,4588,4591,4590,4593,4592,4594,4596,4595,4597,4598,4599,4600,4601,4602,4604,4603,4606,4605,4608,4607,4609,4610,4611,4613,4612,4614,4615,4616,4618,4617,4619,4621,4620,4623,4622,4625,4624,4627,4626,4628,4629,4630,4631,4633,4632,4635,4634,4637,4636,4639,4638,4641,4640,4642,4643,4645,4644,4646,4648,4647,4650,4649,4651,4653,4652,4655,4654,4656,4658,4657,4659,4660,4662,4661,4663,4665,4664,4667,4666,4668,4670,4669,4672,4671,4674,4673,4675,4676,4678,4677,4679,4681,4680,4683,4682,4684,4685,4686,4688,4687,4689,4691,4690,4692,4693,4695,4694,4697,4696,4698,4699,4700,4701,4702,4703,4704,4706,4705,4708,4707,4709,4711,4710,4713,4712,4714,4715,4716,4717,4718,4719,4720,4722,4721,4723,4724,4725,4727,4726,4729,4728,4730,4732,4731,4733,4734,4736,4735,4738,4737,4740,4739,4742,4741,4743,4744,4746,4745,4748,4747,4750,4749,4752,4751,4754,4753,4756,4755,4758,4757,4760,4759,4762,4761,4764,4763,4765,4767,4766,4768,4769,4771,4770,4773,4772,4775,4774,4776,4777,4778,4780,4779,4782,4781,4784,4783,4786,4785,4787,4789,4788,4790,4791,4793,4792,4794,4795,4796,4798,4797,4800,4799,4802,4801,4804,4803,4806,4805,4807,4809,4808,4810,4811,4813,4812,4815,4814,4817,4816,4818,4820,4819,4822,4821,4823,4824,4825,4826,4827,4829,4828,4831,4830,4832,4833,4835,4834,4836,4838,4837,4840,4839,4841,4843,4842,4844,4846,4845,4847,4849,4848,4850,4851,4853,4852,4855,4854,4857,4856,4859,4858,4861,4860,4862,4864,4863,4866,4865,4868,4867,4869,4870,4871,4873,4872,4875,4874,4876,4877,4878,4879,4881,4880,4883,4882,4885,4884,4887,4886,4888,4889,4890,4892,4891,4894,4893,4896,4895,4897,4898,4900,4899,4901,4903,4902,4904,4906,4905,4907,4908,4909,4910,4912,4911,4914,4913,4915,4916,4918,4917,4920,4919,4921,4923,4922,4924,4925,4927,4926,4928,4930,4929,4931,4932,4933,4934,4936,4935,4938,4937,4939,4940,4942,4941,4944,4943,4945,4947,4946,4948,4950,4949,4952,4951,4954,4953,4955,4956,4957,4958,4960,4959,4962,4961,4963,4964,4965,4967,4966,4968,4970,4969,4972,4971,4973,4974,4976,4975,4978,4977,4980,4979,4981,4983,4982,4985,4984,4986,4987,4989,4988,4990,4991,4993,4992,4995,4994,4996,4998,4997,4999}));
    }
    
}
