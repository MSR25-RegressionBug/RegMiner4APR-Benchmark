# RegMiner4APR-Regression-Bugs

## 📄 Repository Structure

Each branch in this repository follows the naming convention `RegressionBug-i`, where `i` is from 1 to 95. The structure of each branch is as follows:

```
RegressionBug-i
|--- BFC
|--- BUGGY
|--- BIC
|___ WORKING
```

## 🗄️ Data Availability
The complete dataset, including all versions and associated metadata, is accessible on [Figshare](https://figshare.com/s/e682027596fd3224ea31) for permanent storage and easy reproducibility.

## 📜 REGMINER4APR - REGRESSION BUGS

Below is the raw bug information, prior to the migration of test cases and their dependencies.

| Bug ID   | Repository | BIC      | BFC      | Test Cases |
|:---------|:-----------|:---------|:---------|:-----------|
| RegressionBug-1 | w3c/epubcheck | 25c0b3726c7284596a87551b82128fa41b636662 | 4e17714866ca4e8b183e001badf7bd5fd63f2216 | com.adobe.epubcheck.api.Epub30CheckExpandedTest#testIssue922 |
| RegressionBug-2 | srikanth-lingala/zip4j | d5c5b413a2996bceb65db4adfd353030baf21d94 | 13c170672da595561163804dc62451dc21bfc870 | net.lingala.zip4j.io.inputstream.ZipInputStreamIT#testReadingZipBySkippingDataCreatedWithJDKZipReadsAllEntries |
| RegressionBug-3 | logic-ng/LogicNG | 87f078c124e5611be639dda3df7d26b7ac5bc74b | d76c40e2ff95f3906658472befd25ceaffca4b3d | org.logicng.transformations.FormulaFactoryImporterTest#testImplication |
| RegressionBug-4 | logic-ng/LogicNG | 0371a73fcf50ee68f1f38c78254c9c64d847edf8 | 02b45df89da53064a07d2fe6d34b1de4ac767727 | org.logicng.explanations.smus.SmusComputationTest#testSatisfiable |
| RegressionBug-5 | jenkinsci/junit-plugin | 3f2ef15940aa985ded2599a11154dc20be9f105c | d5f483ed41c1b5d0dd3e7c56b07ef4aa599b095a | hudson.tasks.junit.CaseResultTest#emptyName |
| RegressionBug-6 | jitsi/ice4j | 513fb588d65de5a1437f50c51313a98a1fe18e58 | 105a49749e32c0ff337f0c0263caa65e303974c1 | org.ice4j.stack.ShallowStackTest#testRetransmissionOriginalWait |
| RegressionBug-7 | killme2008/aviatorscript | 6f2cf72461b4a8cf86ce9e25f504601c9f1027c3 | 0fb5c7850dcf343b3b5929e9fe916125e771f916 | com.googlecode.aviator.test.function.GrammarUnitTest#testIssue177 |
| RegressionBug-8 | bkiers/Liqp | 4e709006fede6bc5dd2273f63ab1058266c287c6 | 576f2a63010e573e3b35d75f7eea75a23630a5f5 | liqp.tags.CycleTest#testCycleInNestedScope |
| RegressionBug-9 | DiUS/java-faker | 31d9a5f2f33b275eb11adde9fa864a80e0bfd65b | d7560762a588f66997d1577b67b8095a6ca810f1 | com.github.javafaker.FakerTest#numberBetweenRepeated;com.github.javafaker.NumberTest#testLongNumberBetweenRepeated |
| RegressionBug-10 | spring-projects/spring-data-commons | 6a5812b3de034a4e440f3378fba5aef189784c10 | b6581ebd1491bb2589a7340f4e834fe0878814cd | org.springframework.data.mapping.model.KotlinCopyMethodUnitTests#shouldDetermineCopyMethodForParametrizedType |
| RegressionBug-11 | spring-projects/spring-data-commons | 6a5812b3de034a4e440f3378fba5aef189784c10 | d43d5add66a02b92c756c9c531fb7bd4f6c21219 | org.springframework.data.mapping.model.KotlinCopyMethodUnitTests#shouldDetermineCopyMethodForParametrizedType |
| RegressionBug-12 | decorators-squad/eo-yaml | c4f4d4d6091de781f6448bd6973b06684f5168f6 | 3dec4ba20c445b36cb38683e8036b69247f297d4 | com.amihaiemil.eoyaml.ReadYamlMappingTest#returnsValueOfStringKeys |
| RegressionBug-13 | decorators-squad/eo-yaml | c4f4d4d6091de781f6448bd6973b06684f5168f6 | e0466f252d7ed97f15f5cb8cb47516b64551be3f | com.amihaiemil.eoyaml.ReadYamlMappingTest#returnsValueOfStringKeys |
| RegressionBug-14 | decorators-squad/eo-yaml | 7ab1901e6cb11a770524d27465dc90ae3aa2353c | 5029085bd9e2304bf259c1990ed92bf3bb351f24 | com.amihaiemil.eoyaml.RtYamlInputTest#readsEscapedScalarsFromSequence |
| RegressionBug-15 | decorators-squad/eo-yaml | 57e7c7fdf0682ff53cbd386edde78bc2d3ae33bc | 7f500f865f8b9d8366d3d58caacd0d125708c064 | com.amihaiemil.eoyaml.FirstCommentFoundTest#noFirstComment |
| RegressionBug-16 | classgraph/classgraph | 876ddc04b0f7932c755bfd2738297da6a772fe7e | b9959ecebd11bfc96c1f4f75a52f56ff2d60e3ff | io.github.classgraph.issues.issue407.Issue407Test#issue407Test |
| RegressionBug-17 | alibaba/fastjson | 21c2f4b2f963c044e4adafef4ddd966661526af9 | 7154e20e0fa11675b700d9812d3f4da1b599325f | com.alibaba.json.bvt.issue_3000.Issue3065#test_for_issue |
| RegressionBug-18 | alibaba/fastjson | 1d860af51a28a4b1f5fb2d9aefaf03f4422b5141 | bb937b92d6ca9d2bf6b532727f2e314219e4805c | com.alibaba.json.bvt.issue_2600.Issue2628#test_for_issue |
| RegressionBug-19 | actiontech/dble | ffddd072e5604f5f9afd9334b53d12b4a53fa972 | 23f47e3cb0326dd53c01843998ebf3a18e35b519 | com.actiontech.dble.parser.ServerParserTest#testIsRollback |
| RegressionBug-20 | actiontech/dble | ffddd072e5604f5f9afd9334b53d12b4a53fa972 | 2a13f54c867840e6b8108b50982386e8572ec1d2 | com.actiontech.dble.parser.ServerParserTest#testIsRollback |
| RegressionBug-21 | alibaba/druid | 833a9b5a6597116adaf4ff1a7ae771752dc3b14a | 98fd85140cdc9ba10879a5d797c646abe842606e | com.alibaba.druid.bvt.filter.wall.mysql.MySqlWallTest148#test_false |
| RegressionBug-22 | alibaba/druid | 5804eea0c9b01411babac031bfaee089bf34bd37 | a588725f6514e8e47b74e249c83e782670f63a67 | com.alibaba.druid.bvt.sql.UnsignedBigIntTest#test_postgresqlUnsignedBitInt;com.alibaba.druid.bvt.sql.UnsignedBigIntTest#test_mysqlUnsignedBitInt |
| RegressionBug-23 | antlr/stringtemplate4 | 8ad2c3dbdceeb33266da748fc209b45218916f08 | 27d3ab6492cd0f276690d332cbd62315e8277df9 | org.stringtemplate.v4.test.TestModelAdaptors#testHandlesKeysNotComparableToString |
| RegressionBug-24 | yegor256/cactoos | ffcf120718db7521711139f292d2b71c7aea27a5 | b0f97d7c9b3044d733995da4815b04c34d87c331 | org.cactoos.io.TeeInputStreamTest#leftInputUnclosed |
| RegressionBug-25 | yegor256/cactoos | 3796bf19195a07490f262d3aea96313d2c23afd0 | d4538f89901d3b47affcefd3ba2c26b1fd281846 | org.cactoos.collection.CollectionEnvelopeTest#notEqualToNull |
| RegressionBug-26 | davidmoten/rtree | 4b4c7487ac40f68e6ef2d2edeb894a9d5682667c | f6aa774eca578976e90975b56a7c5a73c6bd9913 | com.github.davidmoten.rtree.RTreeTest#testRTreeRootMbrWhenRTreeNonEmpty |
| RegressionBug-27 | davidmoten/rtree | 828f8449d51d25d82466bb859546e9ef9e09e33b | 4b4c7487ac40f68e6ef2d2edeb894a9d5682667c | com.github.davidmoten.rtree.RTreeTest#testRTreeRootMbrWhenRTreeNonEmpty;com.github.davidmoten.rtree.UtilTest#testMbrWithNegativeValues |
| RegressionBug-28 | uniVocity/univocity-parsers | 356ce438d31e93785e3cea93e87fa51ea78fb5ad | da3d425307356d1e8a9a3569839c47e30d51a939 | com.univocity.parsers.issues.github.Github_309#parserFilesTest |
| RegressionBug-29 | uniVocity/univocity-parsers | a14ff69061977d8db2a2c9914b4deeb84c70b2ea | e48cdc83ebda8439b0544b7ddbc4f16f2624c3ab | com.univocity.parsers.fixed.FixedWidthWriterTest#writeNullRowShouldReplaceWithNullValueFromSettings;com.univocity.parsers.fixed.FixedWidthWriterTest#testWriterWithSpacesAndOverflow |
| RegressionBug-30 | uniVocity/univocity-parsers | e51b0958af69e677aa742cf4dab068654aca38dd | 3d2ac0beebbcd080e9a7dc80eaaab03a4ff5e18e | com.univocity.parsers.issues.github.Github_250#testParseInputNoIndexSelected |
| RegressionBug-31 | uniVocity/univocity-parsers | e458c3a4a8bf110977b12c30ff5da5edca85212f | 657c90c1ac1d49114ba57a20d35d7ec00097b3b1 | com.univocity.parsers.issues.github.Github_420#detectedFormatTest |
| RegressionBug-32 | uniVocity/univocity-parsers | e458c3a4a8bf110977b12c30ff5da5edca85212f | bcdbdb2b550f981210fe64b9cff19b6e4f9c7baf | com.univocity.parsers.csv.CsvFormatDetectorTest#testDelimitersDetectedUsingOrderOfPreference |
| RegressionBug-33 | uniVocity/univocity-parsers | 48fd5fd661f52e8b98347d81181b2f7c8123054c | f2f866b9b943e2cd4996968472134c754e11a482 | com.univocity.parsers.issues.github.Github_299#shouldDetectNewLine |
| RegressionBug-34 | uniVocity/univocity-parsers | 2836396a78969d1763bcbb8eb4570c579612cecc | 8598d611cf1d6c32f1e7deedaa9310e61818ce28 | com.univocity.parsers.issues.github.Github_39#testMapWritingWithRowProcessor;com.univocity.parsers.issues.github.Github_39#testMapWriting |
| RegressionBug-35 | uniVocity/univocity-parsers | 48fd5fd661f52e8b98347d81181b2f7c8123054c | be25471badbc76f735ba77a075410f0e69a43aed | com.univocity.parsers.issues.github.Github_228#testLastNullValueInQuotedInput2;com.univocity.parsers.issues.github.Github_228#testLastNullValueInQuotedInput |
| RegressionBug-36 | uniVocity/univocity-parsers | c36c6814fe64304437a6af12796c475dac5359fa | bf3b8e608fd1a140ca295447c9025116db68a4cf | com.univocity.parsers.issues.github.Github_198#testDelimiterDetection |
| RegressionBug-37 | uniVocity/univocity-parsers | abe0de1dc65540e8d8333630b397dae1b694aa34 | 52e62f8d4d690627a56b8ab084ecdfbc5ae610bd | com.univocity.parsers.issues.support.Ticket_13#shouldParseFile |
| RegressionBug-38 | uniVocity/univocity-parsers | 15ca061816b19dd2988ba0bc3705f8ef68899b3b | 8d8bf5d6a0abd379cd5e72b9ce0f32a74874e78a | com.univocity.parsers.issues.github.Github_178#testDetectionOnInputWithoutExplicitCharset |
| RegressionBug-39 | uniVocity/univocity-parsers | 70c7f98c46cf41fd205d545bd3334ed44b7ccc0a | cf2d26ab03bffc6728e7914103ce6c46531066e6 | com.univocity.parsers.issues.github.Github_177#testNewlineAfterEscapedQuote |
| RegressionBug-40 | jhy/jsoup | df272b77c2cf89e9cbe2512bbddf8a3bc28a704b | e5210d1f9ef4f1d41ff0a8c4a2ab8e9192d5e087 | org.jsoup.parser.XmlTreeBuilderTest#preservesCaseByDefault |
| RegressionBug-41 | jhy/jsoup | b934c5d3e30917de86796c89fcb7cd000f642a80 | 397a0caeb374c55b8dcb58e09d0faebb6e017252 | org.jsoup.parser.HtmlParserTest#caseInsensitiveParseTree |
| RegressionBug-42 | jhy/jsoup | c3f8caa7c16c08b803b0f34bfffdf9777c7e382c | 91ca25b341bc5ad1c364b8e7389287c45ca9df2c | org.jsoup.nodes.ElementTest#doesntDeleteZWJWhenNormalizingText |
| RegressionBug-43 | jhy/jsoup | ea1fb65e9ff8eee82c4e379dc3236d09a5ab02e1 | 8b837a43cbe2c12624ab2088dc4ff9a725af5f4d | org.jsoup.nodes.AttributeTest#booleanAttributesAreEmptyStringValues |
| RegressionBug-44 | alibaba/fastjson | ef6c08a304ba53d376d8dcde9c4eff2476e27b40 | f5b7a5fce0b61e7150bb27813135e1b1efb97b46 | com.alibaba.json.bvt.issue_1700.Issue1723#test_for_issue |
| RegressionBug-45 | alibaba/fastjson | 67d54ae4f14418e3f9b7df7339b62e093bb0fdfa | 70eaae0eb5307be0d9701037c1d2e8067cc5aeba | com.alibaba.json.bvt.bug.Bug_for_rd#test_for_issue |
| RegressionBug-46 | alibaba/fastjson | d77d469a821373f6b4ac8bc52306e35fd41b0a34 | d672cc22ae2857406da3f2acf2fe6a0d2346224f | com.alibaba.json.bvt.ref.RefTest24#test_ref |
| RegressionBug-47 | alibaba/fastjson | 7b416faa1015ce04505e88d1f9b0575bcf13657f | c8c0005a1c00a3ac7622c87f9733147611494361 | com.alibaba.json.bvt.bug.bug2020.Bug_for_money#test_for_issue |
| RegressionBug-48 | apache/commons-jexl | d23fc99a99ac44f2a4352899e2a6d12d26a74503 | c716d1de3fe1bde6a330629939c45745e9e65e95 | org.apache.commons.jexl3.Issues200Test#test275a |
| RegressionBug-49 | apache/commons-jexl | e94f0a9f948e9b2ffe6635c24ab7d9f8478d4d5f | d8dc706aa1aedb82ed246bf6c4368df4aaf24a54 | org.apache.commons.jexl3.FinalVarTest#testRedefinedPointer |
| RegressionBug-50 | apache/commons-jexl | 817224be9c2762c8a79c1f392522cc98001e5be1 | 37f66c243b28b72dba2e14e4ce12b447762c089a | org.apache.commons.jexl3.ExceptionTest#testExVar |
| RegressionBug-51 | apache/commons-jexl | f6413a34e77cf43b18c6625a0f77f47ffa466ee3 | 4ffa7acc032f58cdf484f4ceae1283111cf1c3b5 | org.apache.commons.jexl3.JXLTTest#testInheritedDebugger |
| RegressionBug-52 | apache/datasketches-java | 68dadd52c3bbc9f8202d5c3cfe67ba9e4eef7b25 | 07b10e37fe7d36dde2f69ddb42a925553329366f | com.yahoo.sketches.theta.DirectUnionTest#checkForDruidBug |
| RegressionBug-53 | apache/datasketches-java | 68dadd52c3bbc9f8202d5c3cfe67ba9e4eef7b25 | 4921d540fdda03c10f02f7fc7df3b55760e9ee6c | com.yahoo.sketches.theta.DirectUnionTest#checkForDruidBug2 |
| RegressionBug-54 | uniVocity/univocity-parsers | ebe87e07e750ff538ef7d116fc0bbe6b6d2c57aa | 1bff05eedec5f5bb24f775eb7c0a774a4d18e7f1 | com.univocity.parsers.common.AbstractWriterTest#testExcludeFields;com.univocity.parsers.common.AbstractWriterTest#testSelectFields |
| RegressionBug-55 | uniVocity/univocity-parsers | e458c3a4a8bf110977b12c30ff5da5edca85212f | e09114c6879fa6c2c15e7365abc02cda3e193ff7 | com.univocity.parsers.issues.github.Github_415#detectedFormatTest |
| RegressionBug-56 | xebialabs/overthere | b709ac07d3c431b754c90eae84e8498ed6c25cb0 | 4c730bdee5c67b98c537e9b475a45ea50f24fe3c | com.xebialabs.overthere.CmdLineTest.shouldEncodeCorrectlyForWindows |
| RegressionBug-57 | xebialabs/overthere | b709ac07d3c431b754c90eae84e8498ed6c25cb0 | 45f9c1dc23a12ce3897f02d4dbf33206eb65b8dd | com.xebialabs.overthere.CmdLineTest.shouldEncodeCorrectlyForWindows |
| RegressionBug-58 | brettwooldridge/HikariCP | 1528a10fc858d46ca0a124d166b5e4affc8b183a | 91bd7dfb33d45c2b07dc04d80f2bdb547211fd28 | com.zaxxer.hikari.pool.TestMetrics#testFakeMetricRegistryThrowsIllegalArgumentException;com.zaxxer.hikari.pool.TestMetrics#testMetricRegistrySubclassIsAllowed |
| RegressionBug-59 | Esri/geometry-api-java | bbfe1d32f9faece46677c651d6965ba1f24e1e46 | 072434b521ad1dd62ef6d9ee2214888a1868e5a3 | com.esri.core.geometry.TestConvexHull#testHullIssueGithub194 |
| RegressionBug-60 | bguerout/jongo | ab5d27f6f6c3750846aeabac8371a705fced4af4 | 1366aa38294148b8fb6b940a5bacb392dd178491 | org.jongo.query.BsonQueryFactoryTest#shouldBindParameterWithCustomLongToken |
| RegressionBug-61 | gitlab4j/gitlab4j-api | f94a51d7e590159fffaa47c898cb7602569d99d9 | d1f22d8c896c4652cac743391f6d0b4e30622917 | org.gitlab4j.api.TestGitLabApiBeans#testIssuesClosedBy |
| RegressionBug-62 | yegor256/cactoos | 5771bc881e19fd56c1ab3ca05a59dee5b47b4272 | 34b1ffdd8f154886e35f78496ec172668100f764 | org.cactoos.func.RepeatedFuncTest#repeatsNullsResults |
| RegressionBug-63 | jmrozanec/cron-utils | 190b51de680b0b55b4f3fff466e4299516074a0f | b173df7c5ba6f9042ed388380b94e2c249765d94 | com.cronutils.model.time.ExecutionTimeCustomDefinitionIntegrationTest#testFiveRequiredFieldsSupported;com.cronutils.model.time.ExecutionTimeCustomDefinitionIntegrationTest#testThreeRequiredFieldsSupported |
| RegressionBug-64 | alibaba/fastjson | 1dbda7de7d31f212bc318a29b42a7979dafe5d6e | e0640e5a0a9a97abb94c56a5f937d0f6d78e88ee | com.alibaba.json.bvt.issue_1500.Issue1529#test_for_issue |
| RegressionBug-65 | jhy/jsoup | ea1fb65e9ff8eee82c4e379dc3236d09a5ab02e1 | 8808e3fbc5a8f25970c151d076636ad05798ff9d | org.jsoup.safety.CleanerTest#handlesAttributesWithNoValue |
| RegressionBug-66 | jhy/jsoup | 654bc6f981587bd4b39b66702550bad33e1eacc9 | b8411990753314ed3b746d3402dec5a65ff6d603 | org.jsoup.parser.CharacterReaderTest#consumeToNonexistentEndWhenAtAnd;org.jsoup.parser.HtmlParserTest#commentAtEnd |
| RegressionBug-67 | jhy/jsoup | f71712ba5d28df09c9a5b6e3c8a37f05f5e3372d | 1028b37a1dfbc5dda7b18cbe692ab168c54fb505 | org.jsoup.nodes.TextNodeTest#testLeadNodesHaveNoChildren |
| RegressionBug-68 | alibaba/fastjson | 7b416faa1015ce04505e88d1f9b0575bcf13657f | 966ff88dc9a6d7b51df39e2bf726061ba25e6485 | com.alibaba.json.bvt.bug.bug2019.Bug20190729_01#test_for_issue;com.alibaba.json.bvt.issue_2500.Issue2516#test_for_issue |
| RegressionBug-69 | alibaba/fastjson | 7b416faa1015ce04505e88d1f9b0575bcf13657f | fab95ad30d827fd66a5714f67c2ba29c73cbe8f2 | com.alibaba.json.bvt.bug.bug2019.Bug20190729_01#test_for_issue |
| RegressionBug-70 | alibaba/fastjson | 771af47385330bf0505b47527698d055d883ddf5 | f6ac9160a3727b94c0926e82955480157939eba9 | com.alibaba.json.bvt.issue_1300.Issue1320#test_for_issue |
| RegressionBug-71 | alibaba/fastjson | 29b669a6704ccac7f1d7f4163005abcc3500b161 | 1f98b0ea33fa9e060f80be84371002caf47e859d | com.alibaba.json.bvt.issue_1400.Issue1422#test_for_issue_1 |
| RegressionBug-72 | alibaba/fastjson | 33eaec097f6cf7c23c7cf8dc08f9ca7b21f9f54c | 30824c9fc7cffe0e564952160e381fbd494ee161 | com.alibaba.json.bvt.issue_2700.Issue2736#test_for_issue |
| RegressionBug-73 | alibaba/fastjson | 21c2f4b2f963c044e4adafef4ddd966661526af9 | 89f0721acd6d121ea4dddbd3974537b2bb3ddd58 | com.alibaba.json.bvt.issue_3000.Issue3031#test_for_issue |
| RegressionBug-74 | alibaba/fastjson | 7ba142b66750a998694ea9a40a24daa8de7fccfa | 7f41acca74fa517748b13667cc8da5d4b7b6e7b3 | com.alibaba.json.bvt.JSONTypeTest_orders_arrayMapping#test_2 |
| RegressionBug-75 | alibaba/fastjson | a2f2212eff39239a2956f7fd11e03555a414c28a | d291f2ded8fed388c059fb6bb3b54e65047dc305 | com.alibaba.json.bvt.issue_1300.Issue1306#test_for_issue |
| RegressionBug-76 | jmrozanec/cron-utils | ff67527e69868a2c2b05ab8a1ddcca8d8f896e44 | 3f039ef4f4dce9c269257bdb5cb6d2a890115c33 | com.cronutils.validator.CronValidatorQuartzIntegrationTest#testOverflowRange |
| RegressionBug-77 | jmrozanec/cron-utils | 1ca44547bfda1b7f86388df3095bcdc1dfe29d0d | de4cfed33ce6e4dde31d800374fca55e8aee9e3d | com.cronutils.utils.descriptor.Issue281Test#shouldAcceptFirstDayOfMonth;com.cronutils.utils.descriptor.Issue281Test#shouldAcceptLastMonth;com.cronutils.utils.descriptor.Issue281Test#shouldAcceptFirstMonth;com.cronutils.utils.descriptor.Issue281Test#shouldAcceptLastDayOfMonth |
| RegressionBug-78 | spring-projects/spring-hateoas | d0ff83c62ec0901cdf827c889197760491e5d1e7 | 47486f42d7998146ddd2bad95894436d76960af4 | org.springframework.hateoas.server.mvc.WebMvcLinkBuilderUnitTest#usesFallbackConversionServiceIfNoContextIsCurrentlyPresent |
| RegressionBug-79 | uniVocity/univocity-parsers | 27132f8c9be596ed90fc0f2f3ea14555091a2b11 | 1ae90ccdf8ba022bbb8ee64c5247576b5ef736c4 | com.univocity.parsers.common.processor.AnnotatedBeanProcessorTest#testRepeatedIndexInAnnotation |
| RegressionBug-80 | spring-projects/spring-hateoas | d98e678c591cdfd56896f7e95b07d471a341a733 | ad3e35bdf1c23e1f0ce6f3338cea7cc5f0e70332 | org.springframework.hateoas.UriTemplateUnitTest#expandsTemplateWithAddedVariable |
| RegressionBug-81 | google/closure-templates | 1f0f5b630801231fe57a07e1d4f522806329e17c | 4afe70d0b7588ee9ff90b26565743cc40509c497 | com.google.template.soy.msgs.restricted.RenderOnlySoyMsgBundleImplTest#testEmptyBundlesDontOverAllocate |
| RegressionBug-82 | google/closure-templates | 1f0f5b630801231fe57a07e1d4f522806329e17c | 84e9a1aa4ac47526934c4e7ab69c440925f224e4 | com.google.template.soy.msgs.restricted.RenderOnlySoyMsgBundleImplTest#testEmptyBundlesDontOverAllocate |
| RegressionBug-83 | google/closure-templates | 5fb13f9b1fe95c71dddaec499d64d767c8f252d3 | 2fdda09b1a821d6fa5f176b42190f4787f6159bc | com.google.template.soy.passes.CombineConsecutiveRawTextNodesPassTest#testForConcurrentModificationBug |
| RegressionBug-84 | google/closure-templates | ffd8586cc39cd5bfb43ec8ddd9a293a999c43003 | 04922d30cc12a1b52eb6e63cbb217ba2baa78f86 | com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testIf;com.google.template.soy.jssrc.internal.JsCodeBuilderTest#testOutputVarWithConcat |
| RegressionBug-85 | google/closure-templates | a7568a0a98bf711de8f415bd262cd03f838400a1 | d0807b5b4cb328dbfc3ec839e5ec4d53a0f6cc0e | com.google.template.soy.jssrc.internal.TranslateExprNodeVisitorTest#testVeLiteral |
| RegressionBug-86 | google/closure-templates | c8858e098f45e874f328a805c980f3f1ed564abe | 425a6843f5056f4aa6930e899bdbd37663f8858b | com.google.template.soy.passes.ResolveExpressionTypesVisitorTest#testArithmeticOps |
| RegressionBug-87 | google/closure-templates | 9a6cafdc1d622d363a329ddc4abbbb45138fbfa6 | 4872424f4d205ef294ccf77ce8b35c774e7099e2 | com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testDelegateVariantProvideRequiresJsDocAnnotations;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testSoyFileInDelegatePackage;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testDelTemplate;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testDelTemplateWithVariant |
| RegressionBug-88 | google/closure-templates | 5202f952cf02e8dac9ef92799af5646d3addbcad | 9ca108c2dfd4adfc9afc152c453790ed2848cea3 | com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testIf;com.google.template.soy.jssrc.internal.GenJsExprsVisitorTest#testIf;com.google.template.soy.jssrc.internal.GenJsExprsVisitorTest#testIfNoElse;com.google.template.soy.jssrc.internal.JspbTest#testNullSafePrimitive;com.google.template.soy.jssrc.internal.JspbTest#testMathOnNullableValues;com.google.template.soy.jssrc.internal.JspbTest#testNullSafeReference;com.google.template.soy.jssrc.internal.NullSafeAccumulatorTest#testMixedChains;com.google.template.soy.jssrc.internal.NullSafeAccumulatorTest#testCallPreservesChain;com.google.template.soy.jssrc.internal.NullSafeAccumulatorTest#testNullSafeChain;com.google.template.soy.jssrc.internal.TranslateExprNodeVisitorTest#testDataRef |
| RegressionBug-89 | google/closure-templates | 6efe470dc3d9119886827e70bc2641f62b23c4dc | ef0e5b59f9e5631390ad1164d3ee62ffc6c263ba | com.google.template.soy.jssrc.internal.GenJsExprsVisitorTest#testRawText;com.google.template.soy.parsepasses.contextautoesc.ContextualAutoescaperTest#testTagNameEdgeCases |
| RegressionBug-90 | google/closure-templates | abe4facd960d967b7f110a69284b688a747b3859 | c50465c5adfa8c15338b3b018f6000e70e2a5fdf | com.google.template.soy.passes.CheckTemplateHeaderVarsPassTest#testV1Expression;com.google.template.soy.passes.ResolveNamesPassTest#testUnknownVariable;com.google.template.soy.passes.ResolveNamesPassTest#testUnknownVariable_v1Expression;com.google.template.soy.passes.ResolveNamesPassTest#testVariableNameRedefinition |
| RegressionBug-91 | google/closure-templates | 4aa2a1a31a5366bb680b8885616437816c312ec1 | 1e7bc030913ce64de06de8097fc7edf4d661dfcf | com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testGoogMsgWithFallback;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testMsgWithSelect;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testMsgWithPlural;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testPlrselMsgWithFallback;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testMsgWithNestedSelectPlural;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testMsgWithCollidingPlrsel;com.google.template.soy.jssrc.internal.GenJsCodeVisitorTest#testMsgWithPlrselHtml |
| RegressionBug-92 | google/closure-templates | e3b73f1cf5fa9d8c38158185a839b6cdc847ddce | d046b14ce025ff5d6ee1f15d8f10cfd184c2c781 | com.google.template.soy.base.internal.SanitizedContentKindTest#testGetAttributeValues;com.google.template.soy.base.internal.TemplateContentKindTest#testForAttributeValue_element |
| RegressionBug-93 | google/closure-templates | e3b73f1cf5fa9d8c38158185a839b6cdc847ddce | fa50c7be6a9d539416b467bc9809f92458531830 | com.google.template.soy.base.internal.SanitizedContentKindTest#testGetAttributeValues;com.google.template.soy.base.internal.TemplateContentKindTest#testForAttributeValue_element |
| RegressionBug-94 | lets-blade/blade | 1f3088b309306512fc8a92402d5f2a5abc28ef29 | c97558276b40c70f5189af8faf1d769aee1be449 | com.blade.mvc.handler.RequestInvokerTest#testRequestHandlerWebHook |
| RegressionBug-95 | alibaba/fastjson | 6e53cca3c60182d91db31c1a8a89e58c3fc4195d | 4f02ba33c30d9fa3c1d2b5623afa891f5bd2493f | com.alibaba.json.bvt.issue_3000.Issue3093#test_for_issue |
