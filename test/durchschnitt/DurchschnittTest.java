package durchschnitt;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */


public class DurchschnittTest extends TestCase {

	Durchschnitt d = new Durchschnitt();

	public void testLeeresFeld() {
		double x = d.berechneDurchschnitt(new int[0]);
		double d = 0;
		assertEquals("Durchschnitt eines Arrays der Groesse 0 ist " + x
				+ " statt " + d +".", d, x);
	}

	public void testEinerFeld() {
		int[] f = { 3 };
		double x = d.berechneDurchschnitt(f);
		double d = 3;
		assertEquals("Durchschnitt eines Arrays der Groesse 1 ist " + x
				+ " statt " + d + ".", d, x);
	}

	public void testKleinesFeld() {
		int[] f = { 3, 6, 11, 4, 2 };
		double x = d.berechneDurchschnitt(f);
		double d = 5.2;
		assertEquals("Durchschnitt des Arrays " + Arrays.toString(f) + " ist "
				+ x + " statt " + d + ".", d, x);
	}

	public void testGrossesFeld() {
		int[] f = { 9670, 89372, 39511, 75084, 63439, 17050, 29452, 94392,
				93250, 46168, 35122, 1274, 25485, 17756, 25599, 27035, 16092,
				56006, 79465, 55083, 74713, 85501, 72433, 58223, 21397, 90142,
				85507, 72893, 80543, 83965, 99315, 9085, 1958, 65699, 64551,
				97945, 87327, 58710, 15915, 60386, 91845, 95873, 27501, 39487,
				65444, 94961, 91284, 77118, 95753, 84292, 37153, 30866, 15859,
				80665, 2903, 21276, 43881, 92026, 5655, 71312, 28556, 15839,
				62347, 50096, 85253, 30786, 56291, 61187, 20215, 34239, 49206,
				22002, 57358, 60807, 93703, 65464, 1539, 28347, 9912, 57558,
				95011, 96948, 51723, 65197, 49619, 93705, 3098, 27650, 66317,
				51511, 12927, 81751, 85718, 33604, 98139, 66209, 48625, 67307,
				19068, 83566, 83880, 90146, 58515, 29695, 82383, 19468, 16532,
				10196, 60738, 92699, 66632, 50651, 65756, 89545, 5938, 73426,
				21922, 39750, 71749, 57553, 77921, 40378, 90044, 20189, 65465,
				55187, 67646, 58256, 43919, 45279, 39091, 67090, 67573, 85006,
				31672, 9272, 78955, 50032, 17717, 41273, 1174, 25477, 81820,
				18174, 75041, 71225, 42600, 87410, 62627, 98778, 33465, 51363,
				17864, 59432, 64955, 25576, 6981, 17102, 62410, 44489, 46783,
				80763, 97033, 69777, 17173, 1278, 5870, 37774, 95830, 95293,
				26759, 41883, 57560, 44889, 58052, 83511, 78622, 35887, 89655,
				40762, 87179, 39931, 41953, 98003, 5059, 15941, 92179, 51343,
				33110, 5014, 64032, 55208, 42709, 19547, 5636, 3400, 49354,
				82121, 83385, 44353, 60769, 52603, 74784, 14822, 11598, 92950,
				52075, 38785, 19486, 58382, 10287, 79109, 23268, 70838, 8241,
				48326, 92940, 26079, 59154, 81898, 33262, 9305, 28649, 52393,
				38068, 45843, 72302, 56252, 90741, 93210, 72305, 36156, 47829,
				88817, 13381, 11492, 87385, 3552, 71783, 76988, 51394, 15705,
				78018, 95342, 62495, 11926, 53903, 53488, 49254, 42366, 17588,
				74140, 71328, 5645, 96403, 74327, 96141, 15974, 86694, 40888,
				42072, 9552, 52244, 49195, 69642, 80232, 58460, 85909, 71831,
				95531, 98184, 49105, 87408, 33183, 76802, 89874, 37024, 95736,
				89278, 28331, 60842, 6112, 39801, 23954, 18585, 60552, 25915,
				5231, 98158, 17072, 33334, 66888, 67357, 27304, 65071, 24234,
				94704, 77530, 59092, 73707, 60062, 90732, 32380, 46248, 73434,
				55670, 26127, 55889, 21250, 91244, 16695, 39760, 63425, 24854,
				78, 57720, 11612, 61964, 53758, 69890, 29332, 50761, 29200,
				38609, 8038, 588, 30632, 7665, 89659, 95715, 91360, 96138,
				25833, 57076, 67533, 6782, 86751, 43737, 31111, 89602, 58455,
				53174, 58697, 20122, 96392, 74803, 81012, 48816, 35194, 74801,
				78928, 53281, 89895, 41854, 86323, 77935, 22151, 3308, 87471,
				77384, 86584, 29063, 77206, 89079, 16938, 76625, 85842, 48454,
				59551, 94863, 57596, 25508, 12468, 96313, 11258, 5585, 82579,
				28279, 4857, 59120, 30237, 21535, 72317, 45204, 31129, 72045,
				99384, 72034, 48485, 15966, 58551, 93677, 75274, 91052, 28281,
				57037, 75623, 38651, 80512, 25524, 27469, 89627, 32254, 96638,
				44326, 94832, 22014, 99517, 33060, 6160, 89870, 5515, 26676,
				87755, 11190, 9910, 16408, 38596, 58315, 46113, 95740, 37480,
				41982, 75089, 20527, 79315, 14787, 52149, 83989, 57702, 2730,
				10893, 3123, 62899, 67675, 19810, 13936, 6599, 93478, 60866,
				76931, 55315, 31663, 51396, 1385, 52731, 38650, 80730, 7228,
				38032, 85893, 61169, 56692, 21997, 26739, 99314, 4431, 65573,
				59330, 78189, 34410, 16664, 33638, 3228, 74647, 30, 12471,
				5890, 6730, 22496, 11266, 17537, 16091, 51052, 9548, 23168,
				61088, 44986, 48116, 79704, 74244, 74831, 340, 36746, 47349,
				40713, 33385, 29064, 93646, 10580, 55766, 19572, 24939, 34834,
				81302, 59098, 29225, 58047, 26374, 95037, 85332, 40736, 97321,
				4772, 5034, 24558, 17885, 51755, 50269, 22857, 92797, 62211,
				33304, 95115, 2918, 98684, 71112, 68687, 79796, 62955, 31693,
				4064, 13047, 95355, 79717, 60982, 2686, 50098, 1629, 11843,
				80328, 16963, 66212, 66179, 88133, 28530, 55628, 15337, 22432,
				39099, 84080, 80062, 20157, 86593, 6486, 45344, 90530, 51880,
				7938, 96660, 71883, 11383, 56236, 29667, 24073, 38245, 94388,
				91419, 50628, 44978, 47752, 25365, 81593, 76186, 21350, 34650,
				37963, 53861, 66903, 48656, 41689, 49671, 6257, 76272, 31398,
				8791, 8132, 56003, 93317, 78036, 28495, 67867, 19314, 97400,
				41366, 54889, 59533, 98600, 6503, 13063, 45808, 16776, 43143,
				47811, 23838, 62281, 4896, 62250, 47066, 18293, 79837, 37983,
				53250, 26968, 72022, 92669, 65923, 1970, 55883, 50297, 37251,
				58414, 33326, 39859, 76234, 82601, 64893, 46029, 86759, 73432,
				90935, 71505, 73723, 74940, 6545, 34816, 62242, 85137, 4828,
				19681, 14912, 70203, 57138, 12429, 25145, 35019, 56000, 12519,
				10815, 1147, 6715, 77843, 31741, 21592, 17011, 71314, 6995,
				17993, 623, 8122, 13570, 60414, 80289, 64077, 6659, 22464,
				48424, 94648, 13590, 35210, 19612, 31554, 18411, 32202, 88033,
				69193, 72194, 24891, 85127, 26736, 35308, 72823, 17973, 73356,
				82223, 16218, 57319, 33858, 76870, 19882, 35647, 49886, 57121,
				36883, 10307, 57916, 50666, 38013, 44514, 59397, 81370, 68776,
				59865, 712, 15132, 89509, 18051, 50998, 37350, 26192, 96557,
				64449, 50259, 9609, 33407, 40348, 27762, 8760, 29379, 48878,
				67782, 70747, 12627, 73662, 37750, 63842, 90285, 33032, 17526,
				83051, 34340, 81167, 5871, 18185, 75013, 57542, 71531, 3334,
				3806, 48534, 98048, 63573, 20578, 48565, 92620, 49856, 94208,
				59813, 3648, 6265, 44830, 49340, 19024, 45122, 97080, 90353,
				97827, 14967, 98478, 50376, 21730, 33974, 44766, 53265, 39284,
				27117, 4953, 34292, 16170, 49253, 92788, 27905, 97553, 98233,
				88516, 76342, 34913, 22285, 75041, 23921, 28993, 4108, 15989,
				66606, 92982, 60472, 69663, 59368, 45600, 30608, 2513, 44901,
				2448, 39235, 38518, 56398, 45795, 10834, 56711, 64391, 17938,
				80590, 28143, 83060, 1308, 94424, 65651, 24949, 19700, 15615,
				45080, 94711, 19331, 58751, 45007, 42249, 65856, 53076, 43457,
				53561, 24043, 96794, 4799, 43634, 70503, 1476, 87728, 29858,
				26683, 41434, 6102, 6761, 89280, 16796, 78460, 13243, 78281,
				10954, 9122, 82037, 19058, 73191, 54048, 87780, 24214, 85492,
				38030, 64869, 43387, 78899, 6254, 49176, 4705, 49237, 12935,
				8742, 80344, 84652, 72465, 67719, 70422, 58106, 24392, 95136,
				14411, 56826, 92556, 25433, 7313, 17691, 50841, 1302, 19049,
				12613, 43246, 80973, 89811, 81223, 44360, 31911, 1576, 39479,
				87843, 40784, 6554, 2336, 35122, 5592, 27016, 46167, 4273,
				40025, 27774, 2381, 29959, 12376, 2548, 17517, 79261, 61780,
				8465, 37065, 5402, 83054, 29197, 70368, 81590, 48080, 46502,
				72180, 20612, 36482, 52406, 32801, 52293, 81228, 39832, 3182,
				573, 95828, 68136, 93997, 74701, 38980, 11890, 78391, 64948,
				89786, 66125, 96972, 12204, 52055, 99366, 10578, 2989, 79782,
				16956, 71456, 26648, 17521, 21480, 86702, 19880, 79166, 34570,
				29177, 15239, 46564, 74893, 10559, 4922, 55426, 70865, 68820,
				28844, 50146, 23404, 38117, 96939, 31433, 24019, 62931, 59597,
				91082, 76561, 90299, 47289, 26720, 67183, 24017, 10676, 56043,
				76348, 52979, 5891, 4838, 29186, 72124, 86166, 25998, 36060,
				98950, 80637, 17770, 83878, 51150, 63875, 48626, 534, 91648,
				45599, 63458, 29773, 66159, 39021, 41188, 21859, 55376, 98402,
				97417, 66617, 38965, 51649, 77407, 69713, 21810, 92169, 64485,
				526, 4245 };
		double x = d.berechneDurchschnitt(f);
		double d = 48862.111;
		assertEquals("Durchschnitt des Arrays " + Arrays.toString(f) + " ist "
				+ x + " statt " + d + ".", d, x);
	}

}

