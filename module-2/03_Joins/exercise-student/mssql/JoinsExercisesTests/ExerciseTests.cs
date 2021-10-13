using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;
using System.Transactions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TechElevator.Utilities;

namespace JoinsExercisesTests
{
    [TestClass]
    public class ExerciseTests
    {
        private static readonly string connectionString = @"Data Source=.\SQLEXPRESS;Initial Catalog=MovieDB;Integrated Security=SSPI;";
        private SqlConnection conn;
        private TransactionScope transaction;
        private static string exerciseFolder;
        private static string solutionFolder;
        private static List<string> exerciseFiles;
        private static List<string> solutionFiles;

        [ClassInitialize]
        public static void InitializeTestClass(TestContext context)
        {
            exerciseFiles = GetExerciseSqlFiles();
            solutionFiles = GetSolutionSqlFiles();
            if (exerciseFiles.Count == 0)
            {
                Assert.Fail("Exercise folder and files not found. Please check that the exercise folder is in the same directory or in a directory above where these tests are running from.");
            }
            if (solutionFiles.Count == 0)
            {
                Assert.Fail("Solution folder and files not found. Please check that the solution folder is in the same directory or in a directory above where these tests are running from.");
            }
            if (exerciseFiles.Count != solutionFiles.Count)
            {
                Assert.Fail("Not the same number of exercise and solution files.");
            }
        }

        /// <summary>
        /// Initializes the database for the test.
        /// </summary>
        [TestInitialize]
        public void BeforeEachTest()
        {
            // Begin the transaction
            transaction = new TransactionScope();

            // this is day 1, just SELECT statements. If the students have a problem with their database, they should reload it with the script from lecture
            //// Get the sql
            //string sql = File.ReadAllText("reload-world-database.sql");

            //using (SqlConnection conn = new SqlConnection(connectionString))
            //{
            //    conn.Open();
            //    SqlCommand cmd = new SqlCommand(sql, conn);
            //    cmd.ExecuteNonQuery();
            //}
        }

        /// <summary>
        /// Cleans up the database after each test.
        /// </summary>
        [TestCleanup]
        public void AfterEachTest()
        {
            if (transaction != null)
            {
                transaction.Dispose();
            }
        }

        [TestMethod]
        public void ExerciseProblem01()
        {
            CheckAnswerForProblem("01");
        }

        [TestMethod]
        public void ExerciseProblem02()
        {
            CheckAnswerForProblem("02");
        }

        [TestMethod]
        public void ExerciseProblem03()
        {
            CheckAnswerForProblem("03");
        }

        [TestMethod]
        public void ExerciseProblem04()
        {
            CheckAnswerForProblem("04");
        }

        [TestMethod]
        public void ExerciseProblem05()
        {
            CheckAnswerForProblem("05");
        }

        [TestMethod]
        public void ExerciseProblem06()
        {
            CheckAnswerForProblem("06");
        }

        [TestMethod]
        public void ExerciseProblem07()
        {
            CheckAnswerForProblem("07");
        }

        [TestMethod]
        public void ExerciseProblem08()
        {
            CheckAnswerForProblem("08");
        }

        [TestMethod]
        public void ExerciseProblem09()
        {
            CheckAnswerForProblem("09");
        }

        [TestMethod]
        public void ExerciseProblem10()
        {
            CheckAnswerForProblem("10");
        }

        [TestMethod]
        public void ExerciseProblem11()
        {
            CheckAnswerForProblem("11");
        }

        [TestMethod]
        public void ExerciseProblem12()
        {
            CheckAnswerForProblem("12");
        }

        [TestMethod]
        public void ExerciseProblem13()
        {
            CheckAnswerForProblem("13");
        }

        [TestMethod]
        public void ExerciseProblem14()
        {
            CheckAnswerForProblem("14");
        }

        [TestMethod]
        public void ExerciseProblem15()
        {
            CheckAnswerForProblem("15");
        }

        [TestMethod]
        public void ExerciseProblem16()
        {
            CheckAnswerForProblem("16");
        }

        [TestMethod]
        public void ExerciseProblem17()
        {
            CheckAnswerForProblem("17");
        }

        [TestMethod]
        public void ExerciseProblem18()
        {
            CheckAnswerForProblem("18");
        }

        [TestMethod]
        public void ExerciseProblem19()
        {
            CheckAnswerForProblem("19");
        }

        [TestMethod]
        public void ExerciseProblem20()
        {
            CheckAnswerForProblem("20");
        }

        [TestMethod]
        public void ExerciseProblem21()
        {
            CheckAnswerForProblem("21");
        }


        private void CheckAnswerForProblem(string problemNumber)
        {
            string sqlActual = GetStudentQuery(problemNumber);

            sqlActual = Regex.Replace(sqlActual, "--[^\n]*(\n|$)", "");
            Assert.IsFalse(string.IsNullOrWhiteSpace(sqlActual), "No query found for this exercise. Make sure you've saved your changes to the exercise file.");

            DataTable dtActual = LoadDataTable(sqlActual);

            string sqlExpected = GetSolutionQuery(problemNumber);
            DataTable dtExpected = SqlRunner.DecodeAndRunQuery(sqlExpected, connectionString);

            TestSuite(dtExpected, dtActual);
        }


        private static void TestSuite(DataTable dtExpected, DataTable dtActual)
        {
            // make sure required columns are returned by student query
            CheckForRequiredColumns(dtExpected, dtActual);

            // make sure student query didn't return too many (can't be too few since we already checked for required columns)
            Assert.AreEqual(dtExpected.Columns.Count, dtActual.Columns.Count, "Query returns too many columns. Check your query and the problem description.");

            // compare expected and actual row counts
            Assert.AreEqual(dtExpected.Rows.Count, dtActual.Rows.Count, "Expected row count doesn't match actual row count.");

            // compare expected and actual data
            CompareData(dtExpected, dtActual);
        }

        private static void CheckForRequiredColumns(DataTable dtExpected, DataTable dtActual)
        {
            foreach (DataColumn dcExp in dtExpected.Columns)
            {
                if (!dtActual.Columns.Contains(dcExp.ColumnName))
                {
                    Assert.Fail($"Missing expected column '{dcExp.ColumnName}'.");
                }
            }
        }

        private static void CompareData(DataTable dtExpected, DataTable dtActual)
        {
            for (int i = 0; i < dtExpected.Rows.Count; i++)
            {
                foreach (DataColumn dc in dtExpected.Columns)
                {
                    Assert.AreEqual(dtExpected.Rows[i][dc.ColumnName], dtActual.Rows[i][dc.ColumnName], $"Data returned doesn't match data expected for row {i + 1} in column \"{dc.ColumnName}\"");
                }
            }
        }

        private string GetStudentQuery(string problemNumber)
        {
            string exerciseFile = $"{exerciseFiles.FirstOrDefault(f => f.StartsWith(problemNumber))}";
            if (exerciseFile == null)
            {
                Assert.Fail($"No exercise file found. Check that the file name begins with {problemNumber}.");
            }

            string exerciseFilePath = $"{exerciseFolder}/{exerciseFile}";
            if (!File.Exists(exerciseFilePath))
            {
                Assert.Fail("Exercise file doesn't exist.");
            }

            string sql = File.ReadAllText(exerciseFilePath);

            return sql;
        }

        private string GetSolutionQuery(string problemNumber)
        {
            string solutionFile = $"{solutionFiles.FirstOrDefault(f => f.StartsWith(problemNumber))}";
            if (solutionFile == null)
            {
                Assert.Fail($"No solution file found. Check that the file name begins with {problemNumber}.");
            }

            string solutionFilePath = $"{solutionFolder}/{solutionFile}";
            if (!File.Exists(solutionFilePath))
            {
                Assert.Fail("Solution file doesn't exist.");
            }

            string sql = File.ReadAllText(solutionFilePath).Trim();

            return sql;
        }

        private DataTable LoadDataTable(string sql)
        {
            using (conn = new SqlConnection(connectionString))
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand(sql, conn);
                SqlDataReader sdr = cmd.ExecuteReader();
                DataTable dt = new DataTable();
                dt.Load(sdr);
                return dt;
            }
        }

        private static List<string> GetExerciseSqlFiles()
        {
            string folderToFind = "Exercises";
            string currPath = System.Environment.CurrentDirectory;
            List<string> exerFiles = new List<string>();

            if (currPath.Contains("\\"))
            {
                currPath = currPath.Replace("\\", "/");
            }

            while (exerFiles.Count == 0)
            {
                if (Directory.GetDirectories(currPath).Any(d => d.EndsWith(folderToFind)))
                {
                    currPath = Directory.GetDirectories(currPath).FirstOrDefault(d => d.EndsWith(folderToFind));
                    exerciseFolder = currPath.Replace("\\", "/");

                    if (Directory.GetFiles(exerciseFolder).Count(f => f.EndsWith(".sql")) > 0)
                    {
                        List<string> tempExerciseFiles = Directory.GetFiles(exerciseFolder).Where(f => f.EndsWith(".sql")).ToList();

                        // get just the filenames so that we don't have to hard code the exercise file names and can find just by number
                        foreach (string ef in tempExerciseFiles)
                        {
                            exerFiles.Add(ef.Replace(exerciseFolder, "").Replace("\\", ""));
                        }
                        break;
                    }
                }
                else
                {
                    if (currPath == "C:" || currPath == "/") //ran out of locations to check
                    {
                        break;
                    }

                    //go up one level
                    currPath = currPath.Substring(0, currPath.LastIndexOf("/"));
                }
            }

            return exerFiles;
        }

        private static List<string> GetSolutionSqlFiles()
        {
            string folderToFind = "encoded-solutions";
            string currPath = System.Environment.CurrentDirectory;
            List<string> slnFiles = new List<string>();

            if (currPath.Contains("\\"))
            {
                currPath = currPath.Replace("\\", "/");
            }

            while (slnFiles.Count == 0)
            {
                if (Directory.GetDirectories(currPath).Any(d => d.EndsWith(folderToFind)))
                {
                    currPath = Directory.GetDirectories(currPath).FirstOrDefault(d => d.EndsWith(folderToFind));
                    solutionFolder = currPath.Replace("\\", "/");

                    if (Directory.GetFiles(solutionFolder).Count(f => f.EndsWith(".txt")) > 0)
                    {
                        List<string> tempExerciseFiles = Directory.GetFiles(solutionFolder).Where(f => f.EndsWith(".txt")).ToList();

                        // get just the filenames so that we don't have to hard code the solution file names and can find just by number
                        foreach (string ef in tempExerciseFiles)
                        {
                            slnFiles.Add(ef.Replace(solutionFolder, "").Replace("\\", ""));
                        }
                        break;
                    }
                }
                else
                {
                    if (currPath == "C:" || currPath == "/") //ran out of locations to check
                    {
                        break;
                    }

                    //go up one level
                    currPath = currPath.Substring(0, currPath.LastIndexOf("/"));
                }
            }

            return slnFiles;
        }
    }
}
